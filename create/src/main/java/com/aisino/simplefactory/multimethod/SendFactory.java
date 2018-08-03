package com.aisino.simplefactory.multimethod;

/**
 * Created by zhukaishengy on 2018-3-12.
 */
class SendFactory {

    Sender produceMail(){
        return new MailSend();
    }
    Sender produceSms(){
        return new SmsSender();
    }
}
