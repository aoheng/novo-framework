package com.novo.commons.support.system.protocol.vo;

import java.io.Serializable;

/**
 * @author of Aoheng
 * @TODO
 * @date 2020-01-30 9:41
 **/

public class PermissionVo implements Serializable {

    public Long id;

    public String permissionName;

    public String url;

    public String permission;

    public Long parentId;

    public Boolean available = Boolean.FALSE;

    //*****************************************************************************************************


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPermissionName() {
        return permissionName;
    }

    public void setPermissionName(String permissionName) {
        this.permissionName = permissionName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public Boolean getAvailable() {
        return available;
    }

    public void setAvailable(Boolean available) {
        this.available = available;
    }
}
