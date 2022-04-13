package com.novo.commons.support.resources.vo;

import com.novo.commons.util.TreeNode;

import java.io.Serializable;
import java.util.List;

/**
 * @author of Aoheng
 * @TODO 基础地区树
 * @date 2020-01-31 16:55
 **/

public class BaseAddressTree extends TreeNode<BaseAddressTree> implements Serializable{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String name;

    private Long code;
    
    private List<BaseAddressTree> children;

	private List<Long> ids;
    //*****************************************************************************************************


	public List<Long> getIds() {
		return ids;
	}

	public void setIds(List<Long> ids) {
		this.ids = ids;
	}

	public static long getSerialVersionUID() {
		return serialVersionUID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getCode() {
		return code;
	}

	public void setCode(Long code) {
		this.code = code;
	}

	@Override
	public List<BaseAddressTree> getChildren() {
		return children;
	}

	@Override
	public void setChildren(List<BaseAddressTree> children) {
		this.children = children;
	}

	@Override
	public void add(BaseAddressTree node) {
		this.children.add(node);
	}
}
