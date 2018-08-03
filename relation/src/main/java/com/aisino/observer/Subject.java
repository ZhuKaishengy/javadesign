package com.aisino.observer;

/**
 *
 * @author zhukaishengy
 * @date 2018-3-13
 */
public interface Subject {

    /**
     * add
     * @param o param
     */
    void add(Observer o);

    /**
     * remove
     * @param o
     */
    void remove(Observer o);

    /**
     * notifyObservers
     */
    void notifyObservers();

    /**
     * operate
     */
    void operate();
}
