package com.aisino.observer;

/**
 *
 * @author zhukaishengy
 * @date 2018-3-13
 */
public class MySubject extends AbstractSubject {

    @Override
    public void operate() {
        System.out.println("begin ...");
        super.notifyObservers();
    }
}
