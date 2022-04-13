package com.novo.commons.support.commodityCenter.system.protocol.vo;

import com.novo.commons.util.TreeNode;

import java.util.List;

/**
 * @Author: duanwenyou
 * @Description:
 * @Date: Created in 11:03 2020/03/06
 */
public class CommodityCategoryTree extends TreeNode<CommodityCategoryTree> {

    private String name;

    private List<CommodityCategoryTree> children;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public List<CommodityCategoryTree> getChildren() {
        return children;
    }

    @Override
    public void setChildren(List<CommodityCategoryTree> children) {
        this.children = children;
    }

    @Override
    public void add(CommodityCategoryTree node) {
        this.children.add(node);
    }
}