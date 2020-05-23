package com.lq.typecho;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.lq.typecho.exception.WPClientException;
import com.lq.typecho.model.request.PostRequest;
import com.lq.typecho.model.request.TypechoPostRequest;
import com.lq.typecho.model.response.Author;
import com.lq.typecho.model.response.Post;
import com.lq.typecho.model.response.TypechoUserBlog;
import com.lq.typecho.model.response.UserBlog;
import com.lq.typecho.tools.JsonKit;
import org.apache.xmlrpc.XmlRpcException;
import org.apache.xmlrpc.client.XmlRpcClient;
import org.apache.xmlrpc.client.XmlRpcClientConfig;
import org.apache.xmlrpc.client.XmlRpcClientConfigImpl;

import javax.net.ssl.*;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 * @author robin
 */
class TypechoClient {

    private TypechoConfig config;

    private XmlRpcClient client;


    TypechoClient(String xmlRpcUrl, boolean trustAll, int connectTimeout, int readTimeout) throws MalformedURLException {
        XmlRpcClientConfigImpl c = new XmlRpcClientConfigImpl();
        c.setServerURL(new URL(xmlRpcUrl));
        if (connectTimeout > 0) {
            c.setConnectionTimeout(connectTimeout);
        }
        if (readTimeout > 0) {
            c.setReplyTimeout(readTimeout);
        }
        if (trustAll) {
            acceptAndCertificate();
        }
        client = new XmlRpcClient();
        client.setConfig(c);
    }


    TypechoClient(TypechoConfig cfg) throws MalformedURLException {
        this(cfg.getXmlRpcUrl(), cfg.isTrustAll(), cfg.getConnectTimeout(), cfg.getReadTimeout());
        XmlRpcClientConfig c = this.client.getClientConfig();
        this.config = cfg;
    }


    boolean deletePost(int postId) throws XmlRpcException, IOException {
        Object[] params = new Object[]{config.getBlogId(), config.getUsername(), config.getPassword(), postId};
        boolean result = execute("wp.deletePost", params, Boolean.class);
        return result;
    }


    boolean editPost(int postId, PostRequest post) throws XmlRpcException, IOException {
        Object[] params = new Object[]{config.getBlogId(), config.getUsername(), config.getPassword(), postId, post.toMap()};
        boolean result = execute("wp.editPost", params, Boolean.class);
        return result;
    }


    /**
     * 修改
     *
     * @param post p
     * @return r
     * @throws XmlRpcException e
     * @throws IOException     e
     */
    int newPost(TypechoPostRequest post) throws XmlRpcException, IOException {
        System.out.println(post.toMap().toString());
        Object[] params = new Object[]{config.getBlogId(), config.getUsername(), config.getPassword(), post.toMap(), true};
        int postId = execute("metaWeblog.newPost", params, Integer.class);
        return postId;
    }


    Post getPost(int postId, String... fields) throws XmlRpcException, IOException {
        ArrayList<Object> params = new ArrayList<>(5);
        params.addAll(Arrays.asList(config.getBlogId(), config.getUsername(), config.getPassword(), postId));
        if (null != fields && fields.length > 0) {
            params.add(fields);
        }
        Post post = execute("wp.getPost", params.toArray(), Post.class);
        return post;
    }


    List<TypechoUserBlog> getRecentPosts(int count) throws XmlRpcException, IOException {
        Object[] params = {config.getBlogId(), config.getUsername(), config.getPassword(), count};
        List<TypechoUserBlog> posts = execute("metaWeblog.getRecentPosts", params, new TypeReference<List<TypechoUserBlog>>() {
        });
        return posts;
    }


    List<Author> getAuthors() throws XmlRpcException, IOException {
        Object[] params = new Object[]{config.getBlogId(), config.getUsername(), config.getPassword()};
        List<Author> authors = execute("wp.getAuthors", params, new TypeReference<List<Author>>() {
        });
        return authors;
    }


    List<UserBlog> getUsersBlogs() throws XmlRpcException, IOException {
        return getUsersBlogs(config.getUsername(), config.getPassword());
    }


    List<UserBlog> getUsersBlogs(String username, String password) throws XmlRpcException, IOException {
        Object[] params = new Object[]{username, password};
        List<UserBlog> ubList = execute("wp.getUsersBlogs", params, new TypeReference<List<UserBlog>>() {
        });
        return ubList;
    }


    private <T> T execute(String methodName, Object[] params, Class<T> classOfT) throws XmlRpcException, IOException {
        String json = execute(methodName, params);
        return JsonKit.fromJson(json, classOfT);
    }


    private <T> T execute(String methodName, Object[] params, TypeReference<T> typeReference) throws XmlRpcException, IOException {
        String json = execute(methodName, params);
        return JsonKit.fromJson(json, typeReference);
    }


    private String execute(String methodName, Object[] params) throws XmlRpcException, JsonProcessingException {

        Object obj = client.execute(methodName, params);

        return JsonKit.toJson(obj);
    }


    private void acceptAndCertificate() {
        try {
            // Create a trust manager that does not validate certificate chains
            TrustManager[] trustAllCerts = new TrustManager[]{new X509TrustManager() {
                @Override
                public X509Certificate[] getAcceptedIssuers() {
                    return null;
                }

                @Override
                public void checkClientTrusted(X509Certificate[] certs,
                                               String authType) {// Trust always
                }

                @Override
                public void checkServerTrusted(X509Certificate[] certs,
                                               String authType) {// Trust always
                }
            }};
            // Install the all-trusting trust manager
            SSLContext sc = SSLContext.getInstance("SSL");
            // Create empty HostnameVerifier
            HostnameVerifier hv = (arg0, arg1) -> true;

            sc.init(null, trustAllCerts, new java.security.SecureRandom());
            HttpsURLConnection.setDefaultSSLSocketFactory(sc.getSocketFactory());
            HttpsURLConnection.setDefaultHostnameVerifier(hv);
        } catch (Exception e) {
            throw new WPClientException(e);
        }
    }
}
