package com.aisino.proxy;

/**
 *
 * @author zhukaishengy
 * @date 2018-3-13
 */
public class Source implements Sourceable {

    @Override
    public void method() {
        System.out.println("source run ...");
    }
}
