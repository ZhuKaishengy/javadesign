package com.aisino.observer;

/**
 * Created by zhukaishengy on 2018-3-13.
 */
public class MySubject extends AbstractSubject {
    public void operate() {
        System.out.println("begin ...");
        super.notifyObservers();
    }
}
