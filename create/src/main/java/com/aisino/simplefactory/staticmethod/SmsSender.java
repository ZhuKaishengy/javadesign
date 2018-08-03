package com.aisino.simplefactory.staticmethod;

/**
 * Created by zhukaishengy on 2018-3-12.
 */
class SmsSender implements Sender {

    @Override
    public void send() {
        System.out.println("sms send ...");
    }
}
