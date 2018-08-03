package com.aisino.bridge;

/**
 *
 * @author zhukaishengy
 * @date 2018-3-13
 */
public class MyBridge extends AbstractBridge {

    @Override
    public void method(){
        super.getSourceable().method();
    }
}
