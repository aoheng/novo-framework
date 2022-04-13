package com.novo.commons.support.resources.vo;

import com.novo.commons.enums.ResourcesType;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

/**
 * 资源配置
 * @author mark_lu
 * 2020年1月15日
 */
public class ResourcesVo implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Long id;
	
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
	 *  父id
	 */
	private Long parentId;
	
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

	private Boolean dataStatus;


	private Set resourceIds;

	private List<ResourcesVo> children;

	private List<Long> parentIds;

	private Long dataSort;


	public Long getDataSort() {
		return dataSort;
	}

	public void setDataSort(Long dataSort) {
		this.dataSort = dataSort;
	}

	public List<Long> getParentIds() {
		return parentIds;
	}

	public void setParentIds(List<Long> parentIds) {
		this.parentIds = parentIds;
	}

	public List<ResourcesVo> getChildren() {
		return children;
	}

	public void setChildren(List<ResourcesVo> children) {
		this.children = children;
	}

	public Set getResourceIds() {
		return resourceIds;
	}

	public void setResourceIds(Set resourceIds) {
		this.resourceIds = resourceIds;
	}

	public Boolean getDataStatus() {
		return dataStatus;
	}

	public void setDataStatus(Boolean dataStatus) {
		this.dataStatus = dataStatus;
	}

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

	public Long getParentId() {
		return parentId;
	}

	public void setParentId(Long parentId) {
		this.parentId = parentId;
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

	public void setResourceCode(String resoureCode) {
		this.resourceCode = resoureCode;
	}

	public String getPlatCode() {
		return platCode;
	}

	public void setPlatCode(String platCode) {
		this.platCode = platCode;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	
	
}
