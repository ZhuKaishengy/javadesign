package com.aisino.command;

/**
 * Created by zhukaishengy on 2018-3-13.
 */
public class MyCommand implements Command {

    private Receiver receiver;

    public MyCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    public void exec() {
        receiver.action();
    }
}
