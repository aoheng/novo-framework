package com.novo.commons.support.organization.protocol;

import com.novo.framework.core.protocol.PaginationRequestProtocol;

/**
 * @Author: duanwenyou
 * @Description:
 * @Date: Created in 11:43 2020/1/15
 */
public class UserDeptmentRequestProtocol extends PaginationRequestProtocol {

    private Long userId;

    private Long deptmentId;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getDeptmentId() {
        return deptmentId;
    }

    public void setDeptmentId(Long deptmentId) {
        this.deptmentId = deptmentId;
    }
}
