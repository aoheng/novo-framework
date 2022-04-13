package com.novo.commons.support.resources.vo;

import com.novo.commons.support.organization.vo.OrganizationVo;
import com.novo.commons.support.system.protocol.vo.RoleVo;
import com.novo.commons.support.system.protocol.vo.UserVo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * @author of Aoheng
 * @TODO
 * @date 2020-11-01 14:54
 **/

public class GuidePageVo implements Serializable {

    private Long id;

    /**
     * 组织id
     */
    private Long orgId;

    /**
     * 组织名称
     */
    private String orgName;
    /**
     * 向导组织码
     */
    private String guideOrgCode;
    /**
     * 平台名称
     */
    private String platName;
    /**
     * 平台id
     */
    private Long platId;
    /**
     * 环节名称
     */
    private String linkName;


    /**
     * 组织对象
     */
    private OrganizationVo orgVo;

    /**
     * 平台对象集合
     */
    private List<PlatformVo> platList;

    /**
     * 平台对象
     */
    private PlatformVo platformVo;

    /**
     * 角色对象
     */
    private RoleVo roleVo;

    /**
     * 用户对象
     */
    private UserVo userVo;

    /**
     * 执行状态(0:未完成,1:已完成)
     */
    private Boolean dataType;


    private Long roleId;

    /**
     * 管理员用户id
     */
    private Long userId;


    private Date createTime;



    /**
     * 平台类型(云系统:S0001,运营后台系统,Y0001,运营商系统,Z0001)
     */
    private String platTypeEnum;

    //*****************************************************************************************************


    public String getPlatTypeEnum() {
        return platTypeEnum;
    }

    public void setPlatTypeEnum(String platTypeEnum) {
        this.platTypeEnum = platTypeEnum;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Long getOrgId() {
        return orgId;
    }

    public void setOrgId(Long orgId) {
        this.orgId = orgId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public UserVo getUserVo() {
        return userVo;
    }

    public void setUserVo(UserVo userVo) {
        this.userVo = userVo;
    }

    public PlatformVo getPlatformVo() {
        return platformVo;
    }

    public void setPlatformVo(PlatformVo platformVo) {
        this.platformVo = platformVo;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public Boolean getDataType() {
        return dataType;
    }

    public void setDataType(Boolean dataType) {
        this.dataType = dataType;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public String getGuideOrgCode() {
        return guideOrgCode;
    }

    public void setGuideOrgCode(String guideOrgCode) {
        this.guideOrgCode = guideOrgCode;
    }

    public String getPlatName() {
        return platName;
    }

    public void setPlatName(String platName) {
        this.platName = platName;
    }

    public Long getPlatId() {
        return platId;
    }

    public void setPlatId(Long platId) {
        this.platId = platId;
    }

    public String getLinkName() {
        return linkName;
    }

    public void setLinkName(String linkName) {
        this.linkName = linkName;
    }

    public OrganizationVo getOrgVo() {
        return orgVo;
    }

    public void setOrgVo(OrganizationVo orgVo) {
        this.orgVo = orgVo;
    }

    public List<PlatformVo> getPlatList() {
        return platList;
    }

    public void setPlatList(List<PlatformVo> platList) {
        this.platList = platList;
    }

    public RoleVo getRoleVo() {
        return roleVo;
    }

    public void setRoleVo(RoleVo roleVo) {
        this.roleVo = roleVo;
    }
}
