package com.aisino.visitor;

import org.junit.Test;

/**
 *
 * @author zhukaishengy
 * @date 2018-3-13
 */
public class VisitorTest {

    @Test
    public void test(){
        Subject subject = new Subject("haha");
        Visitor visitor = new Visitor(subject);
        visitor.visit();
    }
}
