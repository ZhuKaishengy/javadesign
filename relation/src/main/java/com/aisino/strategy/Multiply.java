package com.aisino.strategy;

import java.util.List;

/**
 * Created by zhukaishengy on 2018-3-13.
 */
public class Multiply extends AssistCalcul implements Icalculator {

    public int calcul(String str) {
        List<Integer> ins = super.mySplit(str);
        return ins.get(0)* ins.get(1);
    }
}
