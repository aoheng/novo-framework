package com.novo.commons.support.organization.protocol;

import com.novo.framework.core.protocol.PaginationRequestProtocol;

/**
 * @Author: duanwenyou
 * @Description:
 * @Date: Created in 11:14 2020/05/11
 */
public class OrgAndRoleRequestProtocol extends PaginationRequestProtocol {
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