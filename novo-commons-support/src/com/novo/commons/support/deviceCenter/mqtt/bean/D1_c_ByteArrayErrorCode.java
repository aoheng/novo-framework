package com.novo.commons.support.deviceCenter.mqtt.bean;

import com.novo.framework.core.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Aoheng on 2021/01/31.
 * 错误代码
 */
public class D1_c_ByteArrayErrorCode {

    private List<String> errors;

    public D1_c_ByteArrayErrorCode() {}

    public D1_c_ByteArrayErrorCode(byte[] bytes) {
        errors = new ArrayList<>();

        byte b = bytes[0];
        int n = 0x01;
        if ((b & n) != 0)
            errors.add("加热错误");
        n = n << 1;
        if ((b & n) != 0)
            errors.add("漏水错误");
        n = n << 1;
        if ((b & n) != 0)
            errors.add("NTC温度传感器异常");
        n = n << 1;
        if ((b & n) != 0)
            errors.add("液位开关错误");

        b = bytes[1];
        n = 0x01;
        if ((b & n) != 0)
            errors.add("TDS错误");
        n = n << 1;
        if ((b & n) != 0)
            errors.add("RFID模块异常");

        b = bytes[2];
        n = 0x01;
        if ((b & n) != 0)
            errors.add("高压开关故障");
        n = n << 1;
        if ((b & n) != 0)
            errors.add("UART通讯错误");
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
