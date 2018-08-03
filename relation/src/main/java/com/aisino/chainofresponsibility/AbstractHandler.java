package com.aisino.chainofresponsibility;

/**
 *
 * @author zhukaishengy
 * @date 2018-3-13
 */
abstract class AbstractHandler {

    private Handler handler;

    Handler getHandler() {
        return handler;
    }

    void setHandler(Handler handler) {
        this.handler = handler;
    }
}
