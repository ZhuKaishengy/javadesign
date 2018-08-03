package com.aisino.command;

/**
 *
 * @author zhukaishengy
 * @date 2018-3-13
 */
public class MyCommand implements Command {

    private Receiver receiver;

    MyCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void exec() {
        receiver.action();
    }
}
