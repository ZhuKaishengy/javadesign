package com.aisino.adapter.classmode;

/**
 *
 * @author zhukaishengy
 * @date 2018-3-13
 */
public class Adapter extends Source implements Targetable {
    @Override
    public void method2() {
        System.out.println("method2 ...");
    }
}
