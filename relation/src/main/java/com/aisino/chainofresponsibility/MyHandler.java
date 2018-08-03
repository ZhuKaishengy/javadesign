package com.aisino.chainofresponsibility;

/**
 *
 * @author zhukaishengy
 * @date 2018-3-13
 */
public class MyHandler extends AbstractHandler implements Handler {

    private String name ;

    MyHandler(String name) {
        this.name = name;
    }

    @Override
    public void chain() {
        System.out.println(this.name+":传递。。。");
        if(super.getHandler() != null){
            super.getHandler().chain();
        }
    }
}
