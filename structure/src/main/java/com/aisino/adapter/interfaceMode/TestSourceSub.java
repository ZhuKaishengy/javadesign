package com.aisino.adapter.interfaceMode;

import org.junit.Test;

/**
 * Created by zhukaishengy on 2018-3-13.
 */
public class TestSourceSub {

    @Test
    public void test01(){
        Sourceable sourceable = new SourceSub();
        sourceable.method1();
    }
}
