package com.aisino.state;

import org.junit.Test;

/**
 * Created by zhukaishengy on 2018-3-13.
 */
public class TestState {

    @Test
    public void test(){
        State s = new State("first");
        Command cmd = new Command(s);
        cmd.method();
        System.out.println("change ...");
        s.setStateVal("haha");
        cmd.method();
    }
}
