package com.aisino.factoryMethod;

/**
 * Created by zhukaishengy on 2018-3-12.
 */
class SmsSender implements Sender {
    public void send() {
        System.out.println("sms send ...");
    }
}
