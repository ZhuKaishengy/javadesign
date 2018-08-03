package com.aisino.factorymethod;

import org.junit.Test;

/**
 *
 * @author zhukaishengy
 * @date 2018-3-12
 */
public class FactoryMethodTest {

    @Test
    public void test01(){
        new MailFactory().produce().send();
    }

    @Test
    public void test02(){
        new SmsFactory().produce().send();
    }

}
