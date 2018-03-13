package com.aisino.composite;

import org.junit.Test;

/**
 * Created by zhukaishengy on 2018-3-13.
 */
public class TestTree {

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
