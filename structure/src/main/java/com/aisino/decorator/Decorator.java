package com.aisino.decorator;

/**
 * Created by zhukaishengy on 2018-3-13.
 */
public class Decorator implements Sourceable {

    private Sourceable source;

    public Decorator(Sourceable source) {
        this.source = source;
    }

    public void method1() {
        System.out.println("zks\n");
        source.method1();
        System.out.println("\nsjx");
    }

    public void method2() {
        System.out.println("haha");
    }
}
