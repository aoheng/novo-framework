package com.novo.commons.support.system.protocol.vo;

import java.io.Serializable;
import java.util.List;

public class RoleAndResourceVo implements Serializable {

    public Long id;

    /**
     * 角色id
     */
    public Long roleId;


    /**
     * 资源id
     */
    public Long resourceId;

    /**
     * 资源信息集合
     */
    private List list;


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

    public Long getResourceId() {
        return resourceId;
    }

    public void setResourceId(Long resourceId) {
        this.resourceId = resourceId;
    }

    public List getList() {
        return list;
    }

    public void setList(List list) {
        this.list = list;
    }
}
