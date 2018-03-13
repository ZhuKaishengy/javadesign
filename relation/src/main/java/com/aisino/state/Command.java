package com.aisino.state;

/**
 * Created by zhukaishengy on 2018-3-13.
 */
public class Command {
    private State state;

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public Command(State state) {

        this.state = state;
    }
    public void method(){
        if(this.state.getStateVal().equals("first")){
            state.method1();
        }else{
            state.method2();
        }
    }
}
