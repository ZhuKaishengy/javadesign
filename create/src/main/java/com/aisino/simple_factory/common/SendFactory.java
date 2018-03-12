package com.aisino.simple_factory.common;

/**
 * Created by zhukaishengy on 2018-3-12.
 */
class SendFactory {

    Sender produce(int senderType){
        switch (senderType){
            case 0:
                return new MailSend();
            case 1:
                return new SmsSender();
            default:
                return null;
        }
    }

}
