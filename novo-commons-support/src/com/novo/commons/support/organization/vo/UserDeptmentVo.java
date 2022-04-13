package com.novo.commons.support.organization.vo;

import java.io.Serializable;

/**
 * @Author: duanwenyou
 * @Description:
 * @Date: Created in 10:31 2020/03/12
 */
public class UserDeptmentVo implements Serializable{

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