package com.lq.typecho;

import com.lq.typecho.model.response.TypechoPost;
import org.junit.Test;

public class TestGetPostDetails {
    @Test
    public void testGetPostDetails() {
        Typecho typecho = new Typecho(MyCount.URL + "/index.php/action/xmlrpc", MyCount.USERNAME, MyCount.PASSWORD);

        //获取所有文章
        TypechoPost post = typecho.getPost(30);
        if (post == null) {
            System.out.println("文章不存在");
        } else {
            System.out.println(post.getText());
        }
    }
}
