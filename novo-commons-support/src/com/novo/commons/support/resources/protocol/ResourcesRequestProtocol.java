package com.novo.commons.support.resources.protocol;

import com.novo.framework.core.protocol.PaginationRequestProtocol;

public class ResourcesRequestProtocol extends PaginationRequestProtocol {

    private static final long serialVersionUID = 1L;
    private String name;//资源名
    /**
     * 服务名
     */
    private String reqServiceName;

    /**
     * 资源类型
     */
    private String resourceType;

    private Long[] resourceIds;
    /**
     * 映射字段
     */
    private String mappingField;
    /**
     * 资源路径
     */
    private String resourceUrl;

    /**
     * 父id
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
    private String platformCode;

    protected Boolean dataStatus;

    private Long dataSort;



    public Long getDataSort() {
        return dataSort;
    }

    public void setDataSort(Long dataSort) {
        this.dataSort = dataSort;
    }

    public Boolean getDataStatus() {
        return dataStatus;
    }

    public void setDataStatus(Boolean dataStatus) {
        this.dataStatus = dataStatus;
    }

    public Long[] getResourceIds() {
        return resourceIds;
    }

    public void setResourceIds(Long[] resourceIds) {
        this.resourceIds = resourceIds;
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

    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
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

    public String getPlatformCode() {
        return platformCode;
    }

    public void setPlatformCode(String platformCode) {
        this.platformCode = platformCode;
    }
}
