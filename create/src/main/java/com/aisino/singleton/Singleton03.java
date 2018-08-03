package com.aisino.singleton;

/**
 * 懒汉式：什么时候调用什么时候创建实例
 * Created by zhukaishengy on 2018-3-13.
 */
class Singleton03 {
    /**
     * 私有实例，为什么使用static，因为供外部调用的方法是静态的
     */
    private static Singleton03 instance;

    /**
     * 私有化构造器
     */
    private Singleton03(){}

    /**
     * 提供外部访问的方法， 这不是线程安全的， 需要使用同步锁
     * @return instance 实例对象
     */
    static Singleton03 getInstance(){
        if(instance == null){
            syncInit();
        }
        return instance;
    }

    private static synchronized void syncInit(){
        if(instance == null){
            instance = new Singleton03();
        }
    }
}
