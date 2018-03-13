package com.aisino.chainOfResponsibility;

import org.junit.Test;

/**
 * Created by zhukaishengy on 2018-3-13.
 */
public class TestChain {

    @Test
    public void test(){
        MyHandler sub1 = new MyHandler("sub1");
        MyHandler sub2 = new MyHandler("sub2");
        MyHandler sub3 = new MyHandler("sub3");
        sub1.setHandler(sub2);
        sub2.setHandler(sub3);
        sub1.chain();
    }
}
