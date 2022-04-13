package com.novo.commons.support.resources.protocol;

import com.novo.commons.support.organization.vo.OrganizationVo;
import com.novo.commons.support.resources.vo.PlatformVo;
import com.novo.commons.support.system.protocol.vo.RoleVo;
import com.novo.framework.core.protocol.PaginationRequestProtocol;

/**
 * @author of Aoheng
 * @TODO 向导首页仓库
 * @date 2020-11-01 14:53
 **/

public class GuidePageRequestProtocol extends PaginationRequestProtocol {


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
     * 执行状态(0:未完成,1:已完成)
     */
    private Boolean dataType;

    /**
     * 组织对象
     */
    private OrganizationVo orgVo;

    /**
     * 平台对象
     */
    private PlatformVo platformVo;


    /**
     * 角色对象
     */
    private RoleVo roleVo;

    private Long roleId;

    /**
     * 管理员用户id
     */
    private Long userId;

    private Integer edit;

    //*****************************************************************************************************


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

    public Integer getEdit() {
        return edit;
    }

    public void setEdit(Integer edit) {
        this.edit = edit;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public OrganizationVo getOrgVo() {
        return orgVo;
    }

    public void setOrgVo(OrganizationVo orgVo) {
        this.orgVo = orgVo;
    }

    public PlatformVo getPlatformVo() {
        return platformVo;
    }

    public void setPlatformVo(PlatformVo platformVo) {
        this.platformVo = platformVo;
    }

    public RoleVo getRoleVo() {
        return roleVo;
    }

    public void setRoleVo(RoleVo roleVo) {
        this.roleVo = roleVo;
    }

    public Boolean getDataType() {
        return dataType;
    }

    public void setDataType(Boolean dataType) {
        this.dataType = dataType;
    }

    @Override
    public Long getId() {
        return id;
    }

    @Override
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
}
