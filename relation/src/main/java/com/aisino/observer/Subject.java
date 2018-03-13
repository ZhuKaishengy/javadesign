package com.aisino.observer;

/**
 * Created by zhukaishengy on 2018-3-13.
 */
public interface Subject {

    void add(Observer o);
    void remove(Observer o);
    void notifyObservers();
    void operate();
}
