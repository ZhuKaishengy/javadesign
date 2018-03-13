package com.aisino.templateMethod;

import org.junit.Test;

/**
 * Created by zhukaishengy on 2018-3-13.
 */
public class TestTemplate {

    @Test
    public void test(){
        Icalculator icalculator = new Add();
        int calcul = icalculator.calcul("15,1");
        System.out.println(calcul);
    }
}
