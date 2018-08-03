package com.aisino.observer;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author zhukaishengy
 * @date 2018-3-13
 */
public abstract class AbstractSubject implements Subject{

    private List<Observer> observers = new ArrayList<>(2);

    @Override
    public void add(Observer o) {
        observers.add(o);
    }

    @Override
    public void remove(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }

}
