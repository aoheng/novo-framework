package com.novo.commons.support.deviceCenter.mqtt.bean;


import com.novo.framework.core.util.ByteUtils;
import com.novo.framework.core.util.DateUtils;

import java.nio.ByteOrder;
import java.util.Date;
import java.util.List;

/**
 * 滤芯渠道信息
 * @author MickeyChen
 * @date 2020/7/9
 */
public class D2_ByteArrayFilterOperator {

    /*
    BYTE0：滤芯类别
    BYTE1：滤芯渠道号
    BYTE2-BYTE5：滤芯出厂时间（4字节时间戳）
     */

    /** 滤芯类别 */
    private Integer filterType;
    /** 滤芯1渠道号 */
    private Integer filterOperator;

    private Long filterSn;

    public D2_ByteArrayFilterOperator() {

    }

    public D2_ByteArrayFilterOperator(byte[] bytes) {
        filterType = ByteUtils.toUint8(bytes[0]);
        filterOperator = ByteUtils.toUint8(bytes[1]);
        filterSn = ByteUtils.toUint32(ByteUtils.subByteArray(bytes,2,4),ByteOrder.BIG_ENDIAN);
    }


    @Override
    public String toString() {
        return String.format("{filterType=%s, filterOperator=%s, filterSn=%s", filterType, filterOperator, filterSn);
    }

    public Integer getFilterType() {
        return filterType;
    }

    public void setFilterType(Integer filterType) {
        this.filterType = filterType;
    }

    public Integer getFilterOperator() {
        return filterOperator;
    }

    public void setFilterOperator(Integer filterOperator) {
        this.filterOperator = filterOperator;
    }

    public Long getFilterSn() {
        return filterSn;
    }

    public void setFilterSn(Long filterSn) {
        this.filterSn = filterSn;
    }
}
