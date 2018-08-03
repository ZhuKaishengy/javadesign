package com.aisino.composite;

import org.junit.Test;

/**
 *
 * @author zhukaishengy
 * @date 2018-3-13
 */
public class TreeTest {

    @Test
    public void test(){
        Tree tree = new Tree("A");
        TreeNode b = new TreeNode("B");
        TreeNode c = new TreeNode("C");
        tree.addNode(b);
        tree.addNode(c);
        tree.listChilden();
    }
}
