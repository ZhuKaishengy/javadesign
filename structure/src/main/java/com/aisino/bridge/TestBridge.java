package com.aisino.bridge;

import org.junit.Test;

/**
 * Created by zhukaishengy on 2018-3-13.
 */
public class TestBridge {

    @Test
    public void test1(){

        MyBridge myBridge = new MyBridge();
        myBridge.setSourceable(new SourceSub1());
        myBridge.method();
    }
}
