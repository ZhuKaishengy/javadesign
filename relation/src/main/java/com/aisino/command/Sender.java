package com.aisino.command;

/**
 * Created by zhukaishengy on 2018-3-13.
 */
public class Sender {

    private Command command;

    public Sender(Command command) {
        this.command = command;
    }

    public void action(){
        command.exec();
    }
}
