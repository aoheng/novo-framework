package com.novo.commons.support.system.protocol;

import com.novo.framework.core.protocol.PaginationRequestProtocol;

/**
 * @author of Aoheng
 * @TODO 角色权限访问协议
 * @date 2020-01-29 22:43
 **/

public class RolePermissionRequestProtocol extends PaginationRequestProtocol{



    /**
     * 资源id
     */
    public Long roleId;


    /**
     * 权限id
     */
    public Long permissionId;

    //*****************************************************************************************************



    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public Long getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(Long permissionId) {
        this.permissionId = permissionId;
    }
}
