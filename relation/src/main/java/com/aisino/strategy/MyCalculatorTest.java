package com.aisino.strategy;

import org.junit.Test;

/**
 *
 * @author zhukaishengy
 * @date 2018-3-13
 */
public class MyCalculatorTest {

    @Test
    public void test(){
        Basecalculator add = new Add();
        Basecalculator minus = new Minus();
        Basecalculator multiply = new Multiply();
        Basecalculator divide = new Divide();
        int val1 = add.calcul("10,5");
        int val2 = minus.calcul("10,5");
        int val3 = multiply.calcul("10,5");
        int val4 = divide.calcul("10,5");
        System.out.println(val1);
        System.out.println(val2);
        System.out.println(val3);
        System.out.println(val4);
    }
}
