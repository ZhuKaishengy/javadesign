package com.aisino.state;

/**
 * Created by zhukaishengy on 2018-3-13.
 */
public class State {
    private String stateVal;

    public State() {
    }

    public String getStateVal() {
        return stateVal;
    }

    public void setStateVal(String stateVal) {
        this.stateVal = stateVal;
    }

    public State(String stateVal) {

        this.stateVal = stateVal;
    }
    public void method1(){
        System.out.println("method1 ...");
    }

    public void method2(){
        System.out.println("method2 ...");
    }
}
