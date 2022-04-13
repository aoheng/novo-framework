package com.novo.commons.enums;

/**
 * @author of Aoheng
 * @TODO 通知状态
 * @date 2020-03-14 14:07
 **/

public enum NoticeType {
    Email("禁用"), NOTE("短信");

    private String value;

    private NoticeType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }
}
