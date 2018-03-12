package com.aisino.simple_factory.multiMethod;


import org.junit.Test;

/**
 * Created by zhukaishengy on 2018-3-12.
 * 对普通工厂方法模式的改进，在普通工厂方法模式中，如果传递的字符串出错，则不能正确创建对象，
 * 而多个工厂方法模式是提供多个工厂方法，分别创建对象
 */
public class TestMultiMethod {

    private SendFactory sendFactory;

    {
        sendFactory = new SendFactory();
    }

    @Test
    public void test1(){
        sendFactory.produceMail().send();
    }

    @Test
    public void test2(){
        sendFactory.produceSms().send();
    }


}
