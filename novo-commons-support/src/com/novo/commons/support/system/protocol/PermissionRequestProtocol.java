package com.novo.commons.support.system.protocol;

import com.novo.framework.core.protocol.PaginationRequestProtocol;

/**
 * @author of Aoheng
 * @TODO 权限协议
 * @date 2020-01-30 9:38
 **/

public class PermissionRequestProtocol extends PaginationRequestProtocol{


    public String permissionName;

    public String url;

    public String permission;


    public Boolean available = Boolean.FALSE;

    //*****************************************************************************************************



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


    public Boolean getAvailable() {
        return available;
    }

    public void setAvailable(Boolean available) {
        this.available = available;
    }
}
