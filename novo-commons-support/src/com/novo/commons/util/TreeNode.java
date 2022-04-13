package com.novo.commons.util;

import java.util.List;

/**
 * Created by   aoheng on 2020/6/12.
 */
public abstract class TreeNode<T extends TreeNode> {
    protected Long id;
    protected Long parentId;
    protected  Long  code;

    public abstract  List<T> getChildren();

    public abstract void setChildren(List<T> children);

    public Long getId() {
        return id;
    }

    public Long getCode() {
        return code;
    }

    public void setCode(Long code) {
        this.code = code;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public abstract void add(T node);
}
