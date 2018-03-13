package com.aisino.chainOfResponsibility;

/**
 * Created by zhukaishengy on 2018-3-13.
 */
public class MyHandler extends AbstractHandler implements Handler {

    private String name ;

    public MyHandler(String name) {
        this.name = name;
    }

    public void chain() {
        System.out.println(this.name+":传递。。。");
        if(super.getHandler() != null){
            super.getHandler().chain();
        }
    }
}
