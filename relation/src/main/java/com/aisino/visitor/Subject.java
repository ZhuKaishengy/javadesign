package com.aisino.visitor;

/**
 * Created by zhukaishengy on 2018-3-13.
 */
public class Subject {
    private String value;

    public Subject(String value) {
        this.value = value;
    }

    public String getValue() {

        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
