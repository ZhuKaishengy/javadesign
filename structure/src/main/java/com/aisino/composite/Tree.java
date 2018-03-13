package com.aisino.composite;

/**
 * Created by zhukaishengy on 2018-3-13.
 */
public class Tree implements Nodeable{

    TreeNode root = null;

    public Tree(String name) {
        this.root = new TreeNode(name);
    }

    public void addNode(TreeNode td) {
        root.addNode(td);
    }

    public void removeNode(TreeNode td) {
        root.removeNode(td);
    }

    public void listChilden() {
        root.listChilden();
    }
}
