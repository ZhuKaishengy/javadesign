package com.aisino.proxy;

/**
 * Created by zhukaishengy on 2018-3-13.
 */
public class SourceProxy implements Sourceable {

    private Source source;

    public SourceProxy() {
        this.source = new Source();
    }

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
