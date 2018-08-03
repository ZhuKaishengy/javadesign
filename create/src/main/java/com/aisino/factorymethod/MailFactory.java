package com.aisino.factorymethod;

/**
 *
 * @author zhukaishengy
 * @date 2018-3-12
 */
public class MailFactory implements Producer {

    @Override
    public Sender produce() {
        return new MailSender();
    }
}
