package com.lq.typecho;

import org.junit.Test;

public class TestNewPost {
    @Test
    public void testNewPost() {
        Typecho typecho = new Typecho(MyCount.URL + "/index.php/action/xmlrpc", MyCount.USERNAME, MyCount.PASSWORD);
        System.out.println(typecho.getAuthor().getDisplayName());
    }
}
