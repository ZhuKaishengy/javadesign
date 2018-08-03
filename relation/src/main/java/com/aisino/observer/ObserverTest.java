package com.aisino.observer;

import org.junit.Test;

/**
 *
 * @author zhukaishengy
 * @date 2018-3-13
 */
public class ObserverTest {

    @Test
    public void test(){
        Subject sb = new MySubject();
        sb.add(new OberverSub1());
        sb.add(new OberverSub2());
        sb.operate();
    }
}
