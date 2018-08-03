package com.aisino.composite;

import lombok.*;
import lombok.experimental.Accessors;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author zhukaishengy
 * @date 2018-3-13
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Accessors(chain = true)
@EqualsAndHashCode
public class TreeNode implements Nodeable{

    private String name;
    private TreeNode parent;
    private Set<TreeNode> children = new HashSet<>();

    TreeNode(String name) {
        this.name = name;
    }

    @Override
    public void addNode(TreeNode td){
        this.children.add(td);
    }

    @Override
    public void removeNode(TreeNode td){
        this.children.remove(td);
    }

    @Override
    public void listChilden(){
        for(TreeNode td:this.children){
            System.out.println(td.getName());
        }
    }

}
