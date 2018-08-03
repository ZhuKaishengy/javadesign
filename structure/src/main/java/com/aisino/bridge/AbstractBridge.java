package com.aisino.bridge;

/**
 *
 * @author zhukaishengy
 * @date 2018-3-13
 */
public abstract class AbstractBridge {

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
