package com.lq.typecho;


import org.chobit.wp.WordPress;
import org.chobit.wp.model.request.PostRequest;
import org.chobit.wp.model.response.Author;

/**
 * 首次测试WP协议在typecho上的登陆可行性
 */
public class Test {
    @org.junit.Test
    public void testLogin() {
        WordPress wordPress = new WordPress(MyCount.URL + "/index.php/action/xmlrpc", MyCount.USERNAME, MyCount.PASSWORD);
        Author author = wordPress.getAuthor();
        //测试登陆
        PostRequest postRequest = new PostRequest();
        System.out.println(author.getDisplayName());

        //测试发帖
        postRequest.setPostTitle("测试标题");
        postRequest.setPostContent("测试内容");
        wordPress.newPost(postRequest);
    }
}
