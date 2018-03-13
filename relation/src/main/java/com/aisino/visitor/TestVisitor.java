package com.aisino.visitor;

import org.junit.Test;

/**
 * Created by zhukaishengy on 2018-3-13.
 */
public class TestVisitor {

    @Test
    public void test(){
        Subject subject = new Subject("haha");
        Visitor visitor = new Visitor(subject);
        visitor.visit();
    }
}
