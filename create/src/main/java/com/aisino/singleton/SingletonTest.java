package com.aisino.singleton;

import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author zhukaishengy
 * @date 2018-3-13
 */
public class SingletonTest {

    @Test
    public void test01(){

        Singleton01 instance01 = Singleton01.getInstance();
        Singleton01 instance02 = Singleton01.getInstance();
        Assert.assertEquals(instance01,instance02);
    }

    @Test
    public void test02(){
        Singleton02 instance01 = Singleton02.getInstance();
        Singleton02 instance02 = Singleton02.getInstance();
        Assert.assertEquals(instance01,instance02);
    }

    @Test
    public void test03(){
        Singleton03 instance01 = Singleton03.getInstance();
        Singleton03 instance02 = Singleton03.getInstance();
        Assert.assertEquals(instance01,instance02);
    }
}
