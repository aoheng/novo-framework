package com.novo.commons.support.deviceCenter.mqtt.bean;

import com.novo.framework.core.util.ByteUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * @author MickeyChen
 * @date 2020/12/5
 */
public class D4_ByteArrayPpfDetails {

    /** 字节总长度 */
    private Integer byteToalLength;
    /** 滤芯个数 */
    private Integer ppfCount;
    /** 滤芯剩余百分比 */
    private Map<String, Integer> corePercent;


    public D4_ByteArrayPpfDetails() {}

    public D4_ByteArrayPpfDetails(byte[] bytes) {
        corePercent = new HashMap<>();
        byteToalLength = ByteUtils.toUint8(bytes[0]);
        ppfCount = ByteUtils.toUint8(bytes[1]);
        for (int i = 1; i < byteToalLength; i++) {
            int index = i;
            corePercent.put("coreR"+index, ByteUtils.toUint8(bytes[i+1]));
        }
    }

    @Override
    public String toString() {
        return String.format("{byteToalLength=%s, ppfCount=%s, corePercent=%s}", byteToalLength, ppfCount, corePercent);
    }

    public Integer getByteToalLength() {
        return byteToalLength;
    }

    public Integer getPpfCount() {
        return ppfCount;
    }

    public Map<String, Integer> getCorePercent() {
        return corePercent;
    }
}
