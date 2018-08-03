package com.aisino.bridge;

import org.junit.Test;

/**
 *
 * @author zhukaishengy
 * @date 2018-3-13
 */
public class BridgeTest {

    @Test
    public void test1(){

        MyBridge myBridge = new MyBridge();
        myBridge.setSourceable(new SourceSub1());
        myBridge.method();
    }
}
