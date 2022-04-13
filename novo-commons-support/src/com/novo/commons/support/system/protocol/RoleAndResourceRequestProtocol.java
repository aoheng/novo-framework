package com.novo.commons.support.system.protocol;

import com.novo.commons.support.system.protocol.vo.RoleAndResourceVo;
import com.novo.framework.core.protocol.PaginationRequestProtocol;

/**
 * @author of Aoheng
 * @TODO 角色和资源协议
 * @date 2020-01-15 11:48
 **/
public class RoleAndResourceRequestProtocol extends PaginationRequestProtocol{



    /**
     * 角色id
     */
    public Long roleId;

    private Long[] roleIds;


    /**
     * 资源id
     */
    public Long resourceId;


    /**
     * 版本
     */
    public int version;

    public RoleAndResourceVo vo;

//*********************************************************************************************************************


    public Long[] getRoleIds() {
        return roleIds;
    }

    public void setRoleIds(Long[] roleIds) {
        this.roleIds = roleIds;
    }

    public RoleAndResourceVo getVo() {
        return vo;
    }

    public void setVo(RoleAndResourceVo vo) {
        this.vo = vo;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
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

}
