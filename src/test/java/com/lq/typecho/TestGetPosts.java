package com.lq.typecho;

import com.lq.typecho.model.response.TypechoUserBlog;
import org.junit.Test;

import java.util.List;

public class TestGetPosts {
    @Test
    public void testNewPost() {
        Typecho typecho = new Typecho(MyCount.URL + "/index.php/action/xmlrpc", MyCount.USERNAME, MyCount.PASSWORD);

        //获取所有文章
        List<TypechoUserBlog> posts = typecho.getRecentPosts(10);

        System.out.println(posts);
    }
}
