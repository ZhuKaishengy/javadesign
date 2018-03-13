package com.aisino.templateMethod;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhukaishengy on 2018-3-13.
 */
public abstract class Icalculator {

    int calcul(String str){
        List<Integer> lns = this.mySplit(str);
        return this.calcul(lns.get(0),lns.get(1));
    }
    abstract int calcul (int a,int b);

    List<Integer> mySplit(String str){
        String[] strs = str.split(",");
        List<Integer> ins = new ArrayList<Integer>(2);
        for (String s : strs) {
            Integer i = Integer.parseInt(s);
            ins.add(i);
        }
        return ins;
    }
}
