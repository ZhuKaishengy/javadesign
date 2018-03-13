package com.aisino.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhukaishengy on 2018-3-13.
 */
public abstract class AbstractSubject implements Subject{

    List<Observer> observers = new ArrayList<Observer>(2);

    public void add(Observer o) {
        observers.add(o);
    }

    public void remove(Observer o) {
        observers.remove(o);
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }

}
