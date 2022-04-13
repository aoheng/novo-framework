package com.novo.commons.support.deviceCenter.mqtt.bean;

import com.novo.framework.core.util.StringUtils;

import java.util.List;

/**
 * @author Aoheng on 2021/01/31.
 * 错误代码（NOVO-BOT）
 */
public class D4_ByteArrayErrorCode {

    private List<String> errors;

    /** 套餐下发 */
    private Integer sendPackageStatus;
    /** 投币状态 */
    private Integer coinsStatus;

    public D4_ByteArrayErrorCode() {}

    public D4_ByteArrayErrorCode(byte[] bytes) {
        byte b = bytes[bytes.length-1];
        int n = 0x01;
        sendPackageStatus = (b & n) != 0 ? 1 : 0;
        n = n << 1;
        coinsStatus = (b & n) != 0 ? 1 : 0;
        if (sendPackageStatus != null && sendPackageStatus.equals(1))
            errors.add("套餐下发无响应");
        if (coinsStatus != null && coinsStatus.equals(1))
            errors.add("投币超时");

    }

    @Override
    public String toString() {
        if (errors == null || errors.size() == 0)
            return "NONE";
        else
            return StringUtils.join(errors, "，");
    }

    public List<String> getErrors() {
        return errors;
    }

    public void setErrors(List<String> errors) {
        this.errors = errors;
    }
}
