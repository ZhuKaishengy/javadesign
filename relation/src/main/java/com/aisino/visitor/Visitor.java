package com.aisino.visitor;

/**
 *
 * @author zhukaishengy
 * @date 2018-3-13
 */
public class Visitor {

    private Subject subject;

    void visit(){
        System.out.println("得到数据："+subject.getValue());
    }

    public Visitor(Subject subject) {
        this.subject = subject;
    }
}
