package com.aisino.decorator;

import org.junit.Test;

/**
 *
 * @author zhukaishengy
 * @date 2018-3-13
 */
public class DecoratorTest {

    @Test
    public void test(){
        Sourceable source = new Source();
        Sourceable decorator = new Decorator(source);
        decorator.method1();
        decorator.method2();
    }
}
