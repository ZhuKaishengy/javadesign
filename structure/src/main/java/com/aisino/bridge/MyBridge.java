package com.aisino.bridge;

/**
 * Created by zhukaishengy on 2018-3-13.
 */
public class MyBridge extends Bridge {

    public void method(){
        super.getSourceable().method();
    }
}
