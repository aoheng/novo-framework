package com.novo.commons.support.system.protocol;

import com.novo.commons.enums.RoleType;
import com.novo.commons.support.system.protocol.vo.RoleVo;
import com.novo.framework.core.protocol.PaginationRequestProtocol;

import java.util.List;

/**
 * @author of Aoheng
 * @TODO 角色请求协议
 * @date 2020-01-11 14:58
 **/
public class RoleRequestProtocol extends PaginationRequestProtocol {


    public Long id;

    public String name;

    public Long platId;

    public Long orgId;

    public String platformCode;

    public String orgCode;

    public RoleType roleType;

    public String description;

    public List idList;

    public RoleVo vo;


    private List<Long> resourceIds;


    private Boolean dataStatus;

    /**
     * 是否是超级管理员
     */
    private Boolean isAdmin;

    /**
     * 执行状态(0:未完成,1:已完成)
     */
    private Boolean dataType;

    /**
     * 向导id
     */
    private Long guideId;


    //*********************************************************************************************************************


    public Long getGuideId() {
        return guideId;
    }

    public void setGuideId(Long guideId) {
        this.guideId = guideId;
    }

    public Boolean getDataType() {
        return dataType;
    }

    public void setDataType(Boolean dataType) {
        this.dataType = dataType;
    }

    public Long getOrgId() {
        return orgId;
    }

    public void setOrgId(Long orgId) {
        this.orgId = orgId;
    }

    @Override
    public String getOrgCode() {
        return orgCode;
    }

    @Override
    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode;
    }

    public String getPlatformCode() {
        return platformCode;
    }

    public void setPlatformCode(String platformCode) {
        this.platformCode = platformCode;
    }

    public Long getPlatId() {
        return platId;
    }

    public void setPlatId(Long platId) {
        this.platId = platId;
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

    public List getIdList() {
        return idList;
    }

    public void setIdList(List idList) {
        this.idList = idList;
    }

    public RoleVo getVo() {
        return vo;
    }

    public void setVo(RoleVo vo) {
        this.vo = vo;
    }

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public RoleType getRoleType() {
        return roleType;
    }

    public void setRoleType(RoleType roleType) {
        this.roleType = roleType;
    }

    public Boolean getIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(Boolean admin) {
        isAdmin = admin;
    }

}
