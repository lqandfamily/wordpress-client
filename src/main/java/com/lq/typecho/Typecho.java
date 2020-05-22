package com.lq.typecho;

import com.lq.typecho.exception.WPClientException;
import com.lq.typecho.model.request.PostFilter;
import com.lq.typecho.model.request.PostRequest;
import com.lq.typecho.model.response.Author;
import com.lq.typecho.model.response.Post;
import com.lq.typecho.model.response.UserBlog;

import java.util.List;

/**
 * @author robin
 */
public final class Typecho {

    private TypechoClient client;

    public Typecho(TypechoConfig config) {
        try {
            client = new TypechoClient(config);
        } catch (Exception e) {
            throw new WPClientException("Error in creating wp client.", e);
        }
    }

    public Typecho(String xmlRpcUrl, String username, String password) {
        TypechoConfig config = new TypechoConfigBuilder()
                .xmlRpcUrl(xmlRpcUrl)
                .username(username)
                .password(password)
                .trustAll(true)
                .build();
        try {
            client = new TypechoClient(config);
        } catch (Exception e) {
            throw new WPClientException("Error in creating wp client.", e);
        }
    }


    public UserBlog getUserBlog() {
        List<UserBlog> list = getUsersBlogs();
        if (null == list || list.isEmpty()) {
            throw new WPClientException("Cannot get users and blogs.");
        }
        return list.get(0);
    }


    public List<UserBlog> getUsersBlogs() {
        try {
            return client.getUsersBlogs();
        } catch (Exception e) {
            throw new WPClientException("Error in getting users and blogs.", e);
        }
    }


    public Author getAuthor() {
        List<Author> list = getAuthors();
        if (null == list || list.isEmpty()) {
            throw new WPClientException("Cannot get authors.");
        }
        return list.get(0);
    }


    public List<Author> getAuthors() {
        try {
            return client.getAuthors();
        } catch (Exception e) {
            throw new WPClientException("Error in getting authors.", e);
        }
    }


    public List<Post> getPosts(PostFilter filter, String... fields) {
        try {
            return client.getPosts(filter, fields);
        } catch (Exception e) {
            throw new WPClientException("Error in getting posts.", e);
        }
    }


    public Post getPost(int postId, String... fields) {
        try {
            return client.getPost(postId, fields);
        } catch (Exception e) {
            throw new WPClientException("Error in getting posts.", e);
        }
    }


    public int newPost(PostRequest post) {
        try {
            return client.newPost(post);
        } catch (Exception e) {
            throw new WPClientException("Creating new post failed.", e);
        }
    }


    public boolean editPost(int postId, PostRequest post) {
        try {
            return client.editPost(postId, post);
        } catch (Exception e) {
            throw new WPClientException("Editing post with id " + postId + " failed.", e);
        }
    }


    public boolean deletePost(int postId) {
        try {
            return client.deletePost(postId);
        } catch (Exception e) {
            throw new WPClientException("Deleting post with id " + postId + " failed.", e);
        }
    }
}
