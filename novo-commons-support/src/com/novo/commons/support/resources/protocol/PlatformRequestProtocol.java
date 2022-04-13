package com.novo.commons.support.resources.protocol;

import com.novo.commons.enums.PlatType;
import com.novo.framework.core.protocol.PaginationRequestProtocol;

import java.util.List;

public class PlatformRequestProtocol extends PaginationRequestProtocol {

    private static final long serialVersionUID = 1L;

    private Long id;

    private String name;//平台名

    private String platCode;

    private Boolean dataStatus;

    private String orgCode;

    /**
     * 与平台相关联的资源集合
     */
    private List<Long> resourceIds;


    private Long[] resourceId;


    /**
     * 平台许可
     */
    private PlatType platType;

    /**
     * 平台类型(云系统:S0001,运营后台系统,Y0001,运营商系统,Z0001)
     */
    private String platTypeEnum;

    /**
     * 执行状态(0:未完成,1:已完成)
     */
    private Boolean dataType;

    /**
     * 授权组织
     */
    private String authOrg;

    /**
     * 向导id
     */
    private Long  guideId;

    private Integer extend;

    //*****************************************************************************************************


    public String getPlatTypeEnum() {
        return platTypeEnum;
    }

    public void setPlatTypeEnum(String platTypeEnum) {
        this.platTypeEnum = platTypeEnum;
    }

    public Long[] getResourceId() {
        return resourceId;
    }

    public void setResourceId(Long[] resourceId) {
        this.resourceId = resourceId;
    }

    public Integer getExtend() {
        return extend;
    }

    public void setExtend(Integer extend) {
        this.extend = extend;
    }

    public Long getGuideId() {
        return guideId;
    }

    public void setGuideId(Long guideId) {
        this.guideId = guideId;
    }

    public String getAuthOrg() {
        return authOrg;
    }

    public void setAuthOrg(String authOrg) {
        this.authOrg = authOrg;
    }

    public Boolean getDataType() {
        return dataType;
    }

    public void setDataType(Boolean dataType) {
        this.dataType = dataType;
    }

    public PlatType getPlatType() {
        return platType;
    }

    public void setPlatType(PlatType platType) {
        this.platType = platType;
    }

    @Override
    public String getOrgCode() {
        return orgCode;
    }

    @Override
    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode;
    }

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    public List<Long> getResourceIds() {
        return resourceIds;
    }

    public void setResourceIds(List<Long> resourceIds) {
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

    public String getPlatCode() {
        return platCode;
    }

    public void setPlatCode(String platCode) {
        this.platCode = platCode;
    }


}
