package com.novo.commons.enums;

/**
 * @Author: duanwenyou
 * @Description: 组织状态枚举
 * @Date: Created in 15:16 2020/1/9
 */
public enum OrgStatus {

    Apply("申请"),
    Check("审核"),
    Valid("生效"),
    Disable("禁用");

    private String text;

    private OrgStatus(String text) {
        this.text = text;
    }
    public String getText() {
        return text;
    }
}
