package com.aisino.factorymethod;

/**
 * Created by zhukaishengy on 2018-3-12.
 */
class MailSender implements Sender {

    @Override
    public void send() {
        System.out.println("mail send...");
    }
}
