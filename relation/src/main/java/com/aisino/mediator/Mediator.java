package com.aisino.mediator;

/**
 *
 * @author zhukaishengy
 * @date 2018-3-13
 */
public interface Mediator {

    /**
     * 创建中介者代理的对象
     */
    void createMediator();

    /**
     * 执行被代理的所有方法
     */
    void workAll();

}
