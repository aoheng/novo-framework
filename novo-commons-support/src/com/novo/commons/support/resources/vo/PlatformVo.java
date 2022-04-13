package com.novo.commons.support.resources.vo;

import com.novo.commons.enums.PlatType;
import com.novo.commons.support.organization.vo.OrganizationVo;
import com.novo.commons.support.resources.protocol.GuidePageRequestProtocol;

import java.io.Serializable;
import java.util.List;

/**
 * 平台vo
 *
 * @author mark_lu
 * 2020年1月15日
 */
public class PlatformVo implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private String name;//资源名

    /**
     * 平台编码
     */
    private String platCode;


    private Boolean dataStatus;

    /**
     * 与平台相关联的资源集合
     */
    private List<Long> resourceIds;


    /**
     * 平台许可
     */
    private PlatType platType;

    /**
     * 平台类型(云系统:S0001,运营后台系统,Y0001,运营商系统,Z0001)
     */
    private String platTypeEnum;

    private String platTypeName;

    /**
     * 执行环节
     */
    private String linkName;

    /**
     * 执行状态(0:未完成,1:已完成)
     */
    private Boolean dataType;

    /**
     * 组织对象
     */
    private OrganizationVo orgVo;

    /**
     * 向导对象
     */
    private GuidePageRequestProtocol guide;


    //*****************************************************************************************************


    public String getPlatTypeEnum() {
        return platTypeEnum;
    }

    public void setPlatTypeEnum(String platTypeEnum) {
        this.platTypeEnum = platTypeEnum;
    }

    public GuidePageRequestProtocol getGuide() {
        return guide;
    }

    public void setGuide(GuidePageRequestProtocol guide) {
        this.guide = guide;
    }

    public OrganizationVo getOrgVo() {
        return orgVo;
    }

    public void setOrgVo(OrganizationVo orgVo) {
        this.orgVo = orgVo;
    }

    public Boolean getDataType() {
        return dataType;
    }

    public void setDataType(Boolean dataType) {
        this.dataType = dataType;
    }

    public String getLinkName() {
        return linkName;
    }

    public void setLinkName(String linkName) {
        this.linkName = linkName;
    }

    public String getPlatTypeName() {
        return platTypeName;
    }

    public void setPlatTypeName(String platTypeName) {
        this.platTypeName = platTypeName;
    }

    public PlatType getPlatType() {
        return platType;
    }

    public void setPlatType(PlatType platType) {
        this.platType = platType;
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


}
