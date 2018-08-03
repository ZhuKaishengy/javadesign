package com.aisino.templatemethod;

import org.junit.Test;

/**
 *
 * @author zhukaishengy
 * @date 2018-3-13
 */
public class TemplateTest {

    @Test
    public void test(){
        Basecalculator icalculator = new Add();
        int calcul = icalculator.calcul("15,1");
        System.out.println(calcul);
    }
}
