package com.aisino.decorator;

/**
 *
 * @author zhukaishengy
 * @date 2018-3-13
 */
public class Source implements Sourceable {

    @Override
    public void method1() {
        System.out.println("method1 ...");
    }

    @Override
    public void method2() {
        System.out.println("method2 ...");
    }
}
