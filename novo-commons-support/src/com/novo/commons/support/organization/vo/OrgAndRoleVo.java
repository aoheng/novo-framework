package com.novo.commons.support.organization.vo;

import java.io.Serializable;

/**
 * @Author: duanwenyou
 * @Description:
 * @Date: Created in 11:14 2020/05/11
 */
public class OrgAndRoleVo implements Serializable{
    /**
     * 组织id
     */
    private Long orgId;

    /**
     * 角色id
     */
    private Long roleId;

    public Long getOrgId() {
        return orgId;
    }

    public void setOrgId(Long orgId) {
        this.orgId = orgId;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }
}