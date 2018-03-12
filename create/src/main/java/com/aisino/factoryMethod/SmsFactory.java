package com.aisino.factoryMethod;

/**
 * Created by zhukaishengy on 2018-3-12.
 */
public class SmsFactory implements Producer {
    public Sender produce() {
        return new SmsSender();
    }
}
