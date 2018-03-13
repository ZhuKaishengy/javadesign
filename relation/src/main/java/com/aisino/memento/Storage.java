package com.aisino.memento;

/**
 * Created by zhukaishengy on 2018-3-13.
 */
public class Storage {

    private Memento memento;

    public Storage(Memento memento) {
        this.memento = memento;
    }

    public Memento getMemento() {

        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
