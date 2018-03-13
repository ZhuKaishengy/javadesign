package com.aisino.singleton;

/**
 * Created by zhukaishengy on 2018-3-13.
 */
public class Singleton03 {

    private static Singleton03 instance;

    private Singleton03(){}

    public static Singleton03 getInstance(){
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
