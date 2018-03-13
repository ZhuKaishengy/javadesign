package com.aisino.visitor;

/**
 * Created by zhukaishengy on 2018-3-13.
 */
public class Visitor {

    private Subject subject;

    public void visit(){
        System.out.println("得到数据："+subject.getValue());
    }

    public Visitor(Subject subject) {
        this.subject = subject;
    }
}
