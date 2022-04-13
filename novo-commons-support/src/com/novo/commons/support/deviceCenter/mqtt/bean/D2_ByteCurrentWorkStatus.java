package com.novo.commons.support.deviceCenter.mqtt.bean;

import com.novo.framework.core.util.ByteUtils;

/**
 * @author Aoheng on 2021/01/31.
 * 水机当前运行状态
 */
public class D2_ByteCurrentWorkStatus {

   private String workStatus;
    /** 状态 */
    private Integer status;

    public D2_ByteCurrentWorkStatus() {}

    public D2_ByteCurrentWorkStatus(byte[] bytes) {
        status = ByteUtils.toUint8(bytes[0]);
        if (status == 0x00) {
            workStatus = "关机";
            return;
        }
        if (status == 0x10) {
            workStatus = "待机";
            return;
        }
        if (status == 0x20) {
            workStatus = "预约";
            return;
        }
        if (status == 0x30) {
            workStatus = "运行中";
            return;
        }
        if (status == 0x40) {
            workStatus = "故障";
        }
    }

    @Override
    public String toString() {
        return String.format("{status=%s, workStatus=%s}", status, workStatus);
    }

    public String getWorkStatus() {
        return workStatus;
    }

    public Integer getStatus() {
        return status;
    }
}
