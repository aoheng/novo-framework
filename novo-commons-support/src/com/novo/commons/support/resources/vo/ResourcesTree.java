package com.novo.commons.support.resources.vo;

import com.novo.commons.enums.ResourcesType;
import com.novo.commons.util.TreeNode;

import java.io.Serializable;
import java.util.List;

public class ResourcesTree  extends TreeNode<ResourcesTree> implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;//资源名
	/**
	 * 服务名
	 */
	private String reqServiceName;
	
	/**
	 * 资源类型
	 */
	private ResourcesType resourceType;
	
	/**
	 * 映射字段
	 */
	private String mappingField;
	/**
	 * 资源路径
	 */
	private String resourceUrl;
	
	
	/**
	 * 样式
	 */
	private String style;
	
	/**
	 * 样式类名
	 */
	private String cssClass;
	
	/**
	 * 图标码
	 */
	private String icon;
	
	/**
	 * 层级查询字段（xxxx_xxxx）
	 */
	private String resourceCode;
	
	/**
	 * 平台编码
	 */
	private String platCode;

	private List<ResourcesTree> children;



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getReqServiceName() {
		return reqServiceName;
	}

	public void setReqServiceName(String reqServiceName) {
		this.reqServiceName = reqServiceName;
	}

	public ResourcesType getResourceType() {
		return resourceType;
	}

	public void setResourceType(ResourcesType resourceType) {
		this.resourceType = resourceType;
	}

	public String getMappingField() {
		return mappingField;
	}

	public void setMappingField(String mappingField) {
		this.mappingField = mappingField;
	}

	public String getResourceUrl() {
		return resourceUrl;
	}

	public void setResourceUrl(String resourceUrl) {
		this.resourceUrl = resourceUrl;
	}


	public String getStyle() {
		return style;
	}

	public void setStyle(String style) {
		this.style = style;
	}

	public String getCssClass() {
		return cssClass;
	}

	public void setCssClass(String cssClass) {
		this.cssClass = cssClass;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public String getResourceCode() {
		return resourceCode;
	}

	public void setResourceCode(String resourceCode) {
		this.resourceCode = resourceCode;
	}

	public String getPlatCode() {
		return platCode;
	}

	public void setPlatCode(String platCode) {
		this.platCode = platCode;
	}

	@Override
	public List<ResourcesTree> getChildren() {
		return children;
	}

	@Override
	public void setChildren(List<ResourcesTree> children) {
		this.children = children;
	}

	@Override
	public  void add(ResourcesTree node) {
		this.children.add(node);
	}
	
	

}
