package com.aisino.command;

/**
 *
 * @author zhukaishengy
 * @date 2018-3-13
 */
public class Sender {

    private Command command;

    Sender(Command command) {
        this.command = command;
    }

    void action(){
        command.exec();
    }
}
