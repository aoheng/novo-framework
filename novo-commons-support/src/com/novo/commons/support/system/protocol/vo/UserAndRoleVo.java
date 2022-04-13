package com.novo.commons.support.system.protocol.vo;

import java.io.Serializable;

public class UserAndRoleVo implements Serializable {

    public Long id;

    /**
     * 用户id
     */
    public Long userId;
    /**
     * 角色id
     */
    public Long roleId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }
}
