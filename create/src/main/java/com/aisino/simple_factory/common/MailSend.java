package com.aisino.simple_factory.common;

/**
 * Created by zhukaishengy on 2018-3-12.
 */
class MailSend implements Sender {
    public void send() {
        System.out.println("mail send...");
    }
}