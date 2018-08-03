package com.aisino.composite;

/**
 *
 * @author zhukaishengy
 * @date 2018-3-13
 */
public interface Nodeable {

    /**
     * 添加一个节点
     * @param td
     */
    void addNode(TreeNode td);

    /**
     * 移除一个节点
     * @param td
     */
    void removeNode(TreeNode td);

    /**
     * 遍历子节点
     */
    void listChilden();
}
