package com.aisino.memento;

/**
 * Created by zhukaishengy on 2018-3-13.
 */
public class Memento {

    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Memento(String value) {
        this.value = value;
    }

    public Memento() {
    }
}
