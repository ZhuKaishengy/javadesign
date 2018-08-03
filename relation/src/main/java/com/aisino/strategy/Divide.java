package com.aisino.strategy;

import java.util.List;

/**
 *
 * @author zhukaishengy
 * @date 2018-3-13
 */
public class Divide extends AbstractAssistCalcul implements Basecalculator {

    @Override
    public int calcul (String str) {
        List<Integer> ins = super.mySplit(str);
        return ins.get(0)/ ins.get(1);
    }
}
