package com.aisino.bridge;

/**
 * Created by zhukaishengy on 2018-3-13.
 */
public abstract class Bridge {

    private Sourceable sourceable;

    public void method(){
        sourceable.method();
    }

    public Sourceable getSourceable() {
        return sourceable;
    }

    public void setSourceable(Sourceable sourceable) {
        this.sourceable = sourceable;
    }
}
