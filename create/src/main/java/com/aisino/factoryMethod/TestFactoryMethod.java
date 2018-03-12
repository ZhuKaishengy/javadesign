package com.aisino.factoryMethod;

import org.junit.Test;

/**
 * Created by zhukaishengy on 2018-3-12.
 */
public class TestFactoryMethod {

    @Test
    public void test01(){
        new MailFactory().produce().send();
    }

    @Test
    public void test02(){
        new SmsFactory().produce().send();
    }

}
