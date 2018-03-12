package com.aisino.simple_factory.multiMethod;

/**
 * Created by zhukaishengy on 2018-3-12.
 */
class SmsSender implements Sender {
    public void send() {
        System.out.println("sms send ...");
    }
}
