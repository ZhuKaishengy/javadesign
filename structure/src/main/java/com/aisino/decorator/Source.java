package com.aisino.decorator;

import com.aisino.adapter.interfaceMode.SourceSub;

/**
 * Created by zhukaishengy on 2018-3-13.
 */
public class Source implements Sourceable {
    public void method1() {
        System.out.println("method1 ...");
    }

    public void method2() {
        System.out.println("method2 ...");
    }
}
