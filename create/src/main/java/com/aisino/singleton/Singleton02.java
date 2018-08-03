package com.aisino.singleton;

/**
 * 饿汉式：上来就创建对象
 * Created by zhukaishengy on 2018-3-13.
 */
class Singleton02 {

    /**
     * 私有化构造器
     */
    private Singleton02() {}

    /**
     * 私有化静态内部类，工厂方法
     */
    private static class SingletonFactory {
        private static Singleton02 instance = new Singleton02();
    }

    /**
     * 提供向外部暴露的方法
     * @return instance
     */
    static Singleton02 getInstance() {
        return SingletonFactory.instance;
    }

}
