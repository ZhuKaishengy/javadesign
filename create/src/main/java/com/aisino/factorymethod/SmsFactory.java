package com.aisino.factorymethod;

/**
 *
 * @author zhukaishengy
 * @date 2018-3-12
 */
public class SmsFactory implements Producer {

    @Override
    public Sender produce() {
        return new SmsSender();
    }
}
