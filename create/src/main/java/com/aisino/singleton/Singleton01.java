package com.aisino.singleton;

/**
 * 懒汉式：什么时候调用什么时候创建实例
 * @author zhukaishengy
 * @date 2018-3-13
 */
class Singleton01 {

    /**
     * 私有实例，为什么使用static，因为供外部调用的方法是静态的
     */
    private static Singleton01 instance;

    /**
     * 私有化构造器
     */
    private Singleton01(){}

    /**
     * 提供外部访问的方法， 这不是线程安全的， 需要使用同步锁
     * @return instance 实例对象
     */
    static synchronized Singleton01 getInstance(){

        if(instance == null){
            instance = new Singleton01();
        }
        return instance;
    }
}
