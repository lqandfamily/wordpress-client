package com.lq.typecho;

import com.lq.typecho.exception.WPClientException;
import com.lq.typecho.model.response.UserBlog;

import java.util.List;

/**
 * @author robin
 */
public final class TypechoConfigBuilder {


    private TypechoConfig config = new TypechoConfig();

    public TypechoConfigBuilder username(String username) {
        this.config.setUsername(username);
        return this;
    }


    public TypechoConfigBuilder password(String password) {
        this.config.setPassword(password);
        return this;
    }


    public TypechoConfigBuilder xmlRpcUrl(String xmlRpcUrl) {
        this.config.setXmlRpcUrl(xmlRpcUrl);
        return this;
    }


    public TypechoConfigBuilder trustAll(boolean trustAll) {
        this.config.setTrustAll(trustAll);
        return this;
    }


    public TypechoConfigBuilder connectTimeout(int connectTimeout) {
        if (connectTimeout < 0) {
            throw new IllegalArgumentException("timeout cannot be negative");
        }
        this.config.setConnectTimeout(connectTimeout);
        return this;
    }


    public TypechoConfigBuilder readTimeout(int readTimeout) {
        if (readTimeout < 0) {
            throw new IllegalArgumentException("timeout cannot be negative");
        }
        this.config.setReadTimeout(readTimeout);
        return this;
    }


    public TypechoConfig build() {
        try {
            TypechoClient client = new TypechoClient(config.getXmlRpcUrl(),
                    config.isTrustAll(),
                    config.getConnectTimeout(),
                    config.getReadTimeout());
            List<UserBlog> list = client.getUsersBlogs(config.getUsername(), config.getPassword());
            if (null == list || list.isEmpty()) {
                throw new WPClientException("Error in wp config, please check");
            }
            UserBlog ub = list.get(0);
            this.config.setBlogId(ub.getBlogId());
            return config;
        } catch (Exception e) {
            throw new WPClientException("Error in wp config, please check", e);
        }
    }
}
