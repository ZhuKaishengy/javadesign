package com.aisino.proxy;

import org.junit.Test;

/**
 *
 * @author zhukaishengy
 * @date 2018-3-13
 */
public class ProxyTest {

    @Test
    public void test(){
        new SourceProxy().method();
    }
}
