package com.aisino.composite;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by zhukaishengy on 2018-3-13.
 */
public class TreeNode implements Nodeable{

    private String name;
    private TreeNode parent;
    private Set<TreeNode> children = new HashSet<TreeNode>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TreeNode getParent() {
        return parent;
    }

    public void setParent(TreeNode parent) {
        this.parent = parent;
    }

    public Set<TreeNode> getChildren() {
        return children;
    }

    public void setChildren(Set<TreeNode> children) {
        this.children = children;
    }

    public TreeNode(String name) {
        this.name = name;
    }

    public TreeNode() {
    }

    public void addNode(TreeNode td){
        this.children.add(td);
    }

    public void removeNode(TreeNode td){
        this.children.remove(td);
    }

    public void listChilden(){
        for(TreeNode td:this.children){
            System.out.println(td.getName());
        }
    }

}
