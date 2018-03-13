package com.aisino.chainOfResponsibility;

/**
 * Created by zhukaishengy on 2018-3-13.
 */
public abstract class AbstractHandler {

    private Handler handler;

    public Handler getHandler() {
        return handler;
    }

    public void setHandler(Handler handler) {
        this.handler = handler;
    }
}
