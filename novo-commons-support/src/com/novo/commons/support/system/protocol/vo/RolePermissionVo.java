package com.novo.commons.support.system.protocol.vo;

import java.io.Serializable;

/**
 * @author of Aoheng
 * @TODO
 * @date 2020-01-29 22:49
 **/

public class RolePermissionVo implements Serializable {


    public Long id;
    public Long roleId;
    public Long permissionId;
    //*****************************************************************************************************


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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
