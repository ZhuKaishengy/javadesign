package com.aisino.command;

import org.junit.Test;

/**
 *
 * @author zhukaishengy
 * @date 2018-3-13
 */
public class CommandTest {

    @Test
    public void test(){
        Receiver r = new Receiver();
        Command cmd = new MyCommand(r);
        Sender s = new Sender(cmd);
        s.action();
    }
}
