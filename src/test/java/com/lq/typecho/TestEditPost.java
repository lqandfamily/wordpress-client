package com.lq.typecho;

import com.lq.typecho.enums.CommentStatus;
import com.lq.typecho.model.request.TypechoPostRequest;
import org.junit.Test;

public class TestEditPost {
    @Test
    public void testEditDetails() {
        Typecho typecho = new Typecho(MyCount.URL + "/index.php/action/xmlrpc", MyCount.USERNAME, MyCount.PASSWORD);

        //获取所有文章
        TypechoPostRequest postRequest = new TypechoPostRequest();

        postRequest.setTitle("修改标题");
        postRequest.setText("修改内容");
        postRequest.setCategories("默认分类");
        postRequest.setTags("猫");
        postRequest.setAllowComments(CommentStatus.CLOSED);
        postRequest.setAccessPassword("admin");


        int postId = typecho.editPost(31, postRequest);
        if (postId == 0) {
            System.out.println("文章不存在，修改失败");
        }
        System.out.println(postId);
    }
}
