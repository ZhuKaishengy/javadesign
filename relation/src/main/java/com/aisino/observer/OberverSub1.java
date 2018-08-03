package com.aisino.observer;

/**
 *
 * @author zhukaishengy
 * @date 2018-3-13
 */
public class OberverSub1 implements Observer {

    @Override
    public void update() {
        System.out.println("OberverSub1 ..接受到.. 更新");
    }
}
