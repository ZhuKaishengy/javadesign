package com.aisino.decorator;

import org.junit.Test;

/**
 * Created by zhukaishengy on 2018-3-13.
 */
public class TestDecorator {

    @Test
    public void test(){
        Sourceable source = new Source();
        Sourceable decorator = new Decorator(source);
        decorator.method1();
        decorator.method2();
    }
}
