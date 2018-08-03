package com.aisino.factorymethod;

/**
 * Created by zhukaishengy on 2018-3-12.
 */
interface Producer {

    /**
     * 生产
     * @return sender
     */
    Sender produce();
}
