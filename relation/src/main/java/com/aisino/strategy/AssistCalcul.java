package com.aisino.strategy;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhukaishengy on 2018-3-13.
 */
public abstract class AssistCalcul {

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
