package com.novo.commons.support.system.protocol.vo;

import com.novo.commons.enums.OrgStatus;
import com.novo.commons.enums.RoleType;

import java.io.Serializable;
import java.util.List;

public class RoleVo implements Serializable {


    /**
     * @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么)
     */
    private static final long serialVersionUID = 1L;

    public Long id;

    public String name;

    public RoleType roleType;

    public String description;

    public String platformCode;

    public String platName;

    private String orgCode;

    private String orgName;

    private Boolean dataStatus;
    /**
     * 平台状态
     */
    private Boolean platDataStatus;

    /**
     * 组织状态
     */
    private OrgStatus orgDataStatus;

    /**
     * 查询用户时连同角色一同查询
     */
    private List<Long> resourceIds;

    /**
     * 是否是超级管理员
     */
    private Boolean isAdmin;

    /**
     * 执行环节
     */
    private String linkName;
    /**
     * 执行状态(0:未完成,1:已完成)
     */
    private Boolean dataType;


    //*****************************************************************************************************


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

    public Boolean getPlatDataStatus() {
        return platDataStatus;
    }

    public void setPlatDataStatus(Boolean platDataStatus) {
        this.platDataStatus = platDataStatus;
    }

    public OrgStatus getOrgDataStatus() {
        return orgDataStatus;
    }

    public void setOrgDataStatus(OrgStatus orgDataStatus) {
        this.orgDataStatus = orgDataStatus;
    }

    public String getOrgCode() {
        return orgCode;
    }

    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode;
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public String getPlatName() {
        return platName;
    }

    public void setPlatName(String platName) {
        this.platName = platName;
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public RoleType getRoleType() {
        return roleType;
    }

    public void setRoleType(RoleType roleType) {
        this.roleType = roleType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPlatformCode() {
        return platformCode;
    }

    public void setPlatformCode(String platformCode) {
        this.platformCode = platformCode;
    }

    public Boolean getIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(Boolean admin) {
        isAdmin = admin;
    }
}
