package com.aisino.proxy;

/**
 *
 * @author zhukaishengy
 * @date 2018-3-13
 */
public class SourceProxy implements Sourceable {

    private Source source;

    SourceProxy() {
        this.source = new Source();
    }

    @Override
    public void method() {
        this.before();
        this.source.method();
        this.after();
    }

    private void after() {
        System.out.println("after ...");
    }

    private void before() {
        System.out.println("before ...");
    }
}
