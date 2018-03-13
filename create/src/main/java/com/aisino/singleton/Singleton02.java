package com.aisino.singleton;

/**
 * Created by zhukaishengy on 2018-3-13.
 */
public class Singleton02 {

    private Singleton02() {
    }

    //私有化静态内部类
    private static class SingletonFactory {
        private static Singleton02 instance = new Singleton02();
    }

    public static Singleton02 getInstance() {
        return SingletonFactory.instance;
    }

}
