package com.lq.typecho;

import com.lq.typecho.enums.CommentStatus;
import com.lq.typecho.enums.PingStatus;
import com.lq.typecho.enums.PostStatus;
import com.lq.typecho.model.request.TypechoPostRequest;
import org.junit.Test;

public class TestNewPost {
    @Test
    public void testNewPost() {
        Typecho typecho = new Typecho(MyCount.URL + "/index.php/action/xmlrpc", MyCount.USERNAME, MyCount.PASSWORD);
        System.out.println(typecho.getAuthor().getDisplayName());

        TypechoPostRequest post = new TypechoPostRequest();

        String mdStr = "# 简介\n" +
                "WordPress Client是一个Java版的WordPress客户端操作库， 主要基于[WordPress XML-RPC API](https://codex.wordpress.org/XML-RPC_WordPress_API)实现。目前WordPress Client提供了如下能力：\n" +
                "\n" +
                "* 获取WordPress用户信息\n" +
                "* 获取博客文章信息\n" +
                "* 发布文章到WordPress部署的博客\n" +
                "* 对已发布的文章进行编辑、删除等操作\n" +
                "\n" +
                "# 使用";

        post.setTitle("测试标题37");
        post.setText(mdStr);
//        post.setDateCreated(1490124933627L);
        post.setCategories("测试分类");
        post.setTags(new String[]{"猫", "狗"});
//        post.setAccessPassword("admin");
        post.setPostId(27);
        post.setAllowPings(PingStatus.OPEN);
        post.setPostStatus(PostStatus.SAVE);
        post.setAllowComments(CommentStatus.OPEN);

        typecho.newPost(post);

    }
}
