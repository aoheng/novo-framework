package com.novo.commons.support.resources.vo;

import com.novo.commons.util.TreeNode;

import java.io.Serializable;
import java.util.List;

/**
 * @author of Aoheng
 * @TODO 地区树
 * @date 2020-01-31 16:55
 **/

public class AreaTree extends TreeNode<AreaTree> implements Serializable{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String name;

    private String area_code;
    
    private List<AreaTree> children;
    //*****************************************************************************************************

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArea_code() {
        return area_code;
    }

    public void setArea_code(String area_code) {
        this.area_code = area_code;
    }

	@Override
	public List<AreaTree> getChildren() {
		return children;
	}

	@Override
	public void setChildren(List<AreaTree> children) {
		this.children = children;
	}

	@Override
	public void add(AreaTree node) {
		this.children.add(node);
	}

}
