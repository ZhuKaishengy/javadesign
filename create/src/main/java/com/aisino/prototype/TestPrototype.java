package com.aisino.prototype;

import org.junit.Test;

import java.io.IOException;
import java.util.Date;

/**
 * Created by zhukaishengy on 2018-3-13.
 */
public class TestPrototype {

    @Test
    public void test01() throws CloneNotSupportedException {
        Prototype prototype = new Prototype("haha",new Person(1001,"zks",new Date()));
        Prototype clone = prototype.clone();
        System.out.println(clone.getProp());//haha
        System.out.println(clone.getPerson().getId());//1001
        System.out.println(clone.getPerson().equals(prototype.getPerson()));//true
    }
    @Test
    public void test02() throws CloneNotSupportedException, IOException, ClassNotFoundException {
        Prototype prototype = new Prototype("haha",new Person(1001,"zks",new Date()));
        Prototype clone = prototype.deepClone();
        System.out.println(clone.getProp());//haha
        System.out.println(clone.getPerson().getId());//1001
        System.out.println(clone.getPerson().equals(prototype.getPerson()));//false
    }
}
