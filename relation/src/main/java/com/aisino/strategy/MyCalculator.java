package com.aisino.strategy;

import com.sun.org.apache.xpath.internal.operations.Div;
import org.junit.Test;

/**
 * Created by zhukaishengy on 2018-3-13.
 */
public class MyCalculator {

    @Test
    public void test(){
        Icalculator add = new Add();
        Icalculator minus = new Minus();
        Icalculator multiply = new Multiply();
        Icalculator divide = new Divide();
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
