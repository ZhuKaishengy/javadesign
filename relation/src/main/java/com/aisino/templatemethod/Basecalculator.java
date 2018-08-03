package com.aisino.templatemethod;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhukaishengy on 2018-3-13.
 */
abstract class Basecalculator {

    int calcul(String str){
        List<Integer> lns = this.mySplit(str);
        return this.calcul(lns.get(0),lns.get(1));
    }

    /**
     * 计算的方法
     * @param a 参数
     * @param b 参数
     * @return result
     */
    abstract int calcul (int a,int b);

    private List<Integer> mySplit(String str){

        String[] strs = str.split(",");
        List<Integer> ins = new ArrayList<>(2);
        for (String s : strs) {
            Integer i = Integer.parseInt(s);
            ins.add(i);
        }
        return ins;
    }
}
