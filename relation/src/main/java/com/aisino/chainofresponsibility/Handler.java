package com.aisino.chainofresponsibility;

/**
 *
 * @author zhukaishengy
 * @date 2018-3-13
 */
public interface Handler {
    /**
     * 传递
     */
    void chain();
}
