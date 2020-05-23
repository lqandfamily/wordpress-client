package com.lq.typecho;

import com.lq.typecho.model.response.TypechoUserBlog;
import org.junit.Test;

import java.util.List;

public class TestDeletePost {
    @Test
    public void tesDeletePost() {
        Typecho typecho = new Typecho(MyCount.URL + "/index.php/action/xmlrpc", MyCount.USERNAME, MyCount.PASSWORD);

        List<TypechoUserBlog> recentPosts = typecho.getRecentPosts(10);
        for (TypechoUserBlog blog : recentPosts) {
            System.out.println(blog.getPostId());
        }

        boolean b = typecho.deletePost(36);

        System.out.println(b);
    }
}
