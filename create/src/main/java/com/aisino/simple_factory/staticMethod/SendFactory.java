package com.aisino.simple_factory.staticMethod;

/**
 * Created by zhukaishengy on 2018-3-12.
 */
class SendFactory {

    static Sender produceMail(){
        return new MailSend();
    }
    static Sender produceSms(){
        return new SmsSender();
    }

}
