package com.novo.commons.support.system.protocol;

import com.novo.commons.support.system.protocol.vo.UserAndRoleVo;
import com.novo.framework.core.protocol.PaginationRequestProtocol;

/**
 * @author of Aoheng
 * @TODO 用户和角色协议
 * @date 2020-01-15 11:45
 **/
public class UserAndRoleRequestProtocol extends PaginationRequestProtocol {

    /**
     * 用户id
     */
    public Long userId;


    /**
     * 角色id
     */
    public Long roleId;


    public UserAndRoleVo vo;

    //*********************************************************************************************************************


    public UserAndRoleVo getVo() {
        return vo;
    }

    public void setVo(UserAndRoleVo vo) {
        this.vo = vo;
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
