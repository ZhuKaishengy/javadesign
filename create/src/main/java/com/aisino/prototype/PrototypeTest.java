package com.aisino.prototype;

import org.junit.Test;

import java.io.IOException;
import java.util.Date;

/**
 *
 * @author zhukaishengy
 * @date 2018-3-13
 */
public class PrototypeTest {

    @Test
    public void test01() throws CloneNotSupportedException {
        Prototype prototype = new Prototype("haha",new Person(1001,"zks",new Date()));
        Prototype clone = prototype.clone();
        // haha
        System.out.println(clone.getProp());
        // 1001
        System.out.println(clone.getPerson().getId());
        // true
        System.out.println(clone.getPerson().equals(prototype.getPerson()));
    }
    @Test
    public void test02() throws CloneNotSupportedException, IOException, ClassNotFoundException {
        Prototype prototype = new Prototype("haha",new Person(1001,"zks",new Date()));
        Prototype clone = prototype.deepClone();
        // haha
        System.out.println(clone.getProp());
        // 1001
        System.out.println(clone.getPerson().getId());
        // false
        System.out.println(clone.getPerson().equals(prototype.getPerson()));
    }
}
