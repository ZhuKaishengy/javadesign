package com.aisino.composite;

/**
 *
 * @author zhukaishengy
 * @date 2018-3-13
 */
public class Tree implements Nodeable {

    private TreeNode root = null;

    Tree(String name) {
        this.root = new TreeNode(name);
    }

    @Override
    public void addNode(TreeNode td) {
        root.addNode(td);
    }

    @Override
    public void removeNode(TreeNode td) {
        root.removeNode(td);
    }

    @Override
    public void listChilden() {
        root.listChilden();
    }
}
