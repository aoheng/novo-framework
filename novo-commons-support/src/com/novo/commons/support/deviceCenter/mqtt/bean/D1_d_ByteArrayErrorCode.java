package com.novo.commons.support.deviceCenter.mqtt.bean;

import com.novo.framework.core.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Aoheng on 2021/01/31.
 * 错误代码
 */
public class D1_d_ByteArrayErrorCode {

    private List<String> errors;

    public D1_d_ByteArrayErrorCode() {}

    public D1_d_ByteArrayErrorCode(byte[] bytes) {
        errors = new ArrayList<>();

        byte b = bytes[0];
        int n = 0x01;
        if ((b & n) != 0)
            errors.add("加热错误");
        n = n << 1;
        if ((b & n) != 0)
            errors.add("流量错误");
        n = n << 1;
        if ((b & n) != 0)
            errors.add("NTC温度传感器异常");
        n = n << 1;
        if ((b & n) != 0)
            errors.add("RTC错误");
        n = n << 1;
        if ((b & n) != 0)
            errors.add("EEPROM错误");
        n = n << 3;
        if ((b & n) != 0)
            errors.add("RC500错误");
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
