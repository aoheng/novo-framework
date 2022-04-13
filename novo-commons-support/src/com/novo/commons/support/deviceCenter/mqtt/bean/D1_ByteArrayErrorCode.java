package com.novo.commons.support.deviceCenter.mqtt.bean;

import com.novo.framework.core.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Aoheng on 2021/01/31.
 * 错误代码
 */
public class D1_ByteArrayErrorCode {

    private List<String> errors;

    public D1_ByteArrayErrorCode() {}

    public D1_ByteArrayErrorCode(byte[] bytes, boolean isP22) {
        errors = new ArrayList<String>();

        byte b = bytes[0];
        int n = 0x01;
        if ((b & n) != 0)
            errors.add("放水错误");
        n = n << 1;
        if ((b & n) != 0)
            errors.add("制水错误");
        n = n << 1;
        if ((b & n) != 0)
            errors.add("加热错误");
        n = n << 1;
        if ((b & n) != 0)
            errors.add("漏水错误");
        n = n << 1;
        if ((b & n) != 0)
            errors.add("电磁阀错误");
        n = n << 1;
        if ((b & n) != 0)
            errors.add("增压泵错误");
        n = n << 1;
        if ((b & n) != 0)
            errors.add("偷接错误");
        n = n << 1;
        if ((b & n) != 0)
            errors.add("制冷错误");


        b = bytes[1];
        n = 0x01;
        if ((b & n) != 0)
            errors.add("一键报修");
        n = n << 1;
        if ((b & n) != 0)
            errors.add("流量错误");
        n = n << 1;
        if ((b & n) != 0)
            errors.add("温度传感器错误");
        n = n << 1;
        if ((b & n) != 0)
            errors.add("液压开关错误");
        n = n << 1;
        if ((b & n) != 0)
            errors.add("源水箱液位过高");
        n = n << 1;
        if ((b & n) != 0)
            errors.add("净水箱液位过高");
        n = n << 1;
        if ((b & n) != 0)
            errors.add("TDS错误");
        n = n << 1;
        if ((b & n) != 0)
            errors.add("EEPROM错误");

        b = bytes[2];
        n = 0x01;
        if ((b & n) != 0)
            errors.add("时间同步错误");
        n = n << 1;
        if ((b & n) != 0)
            errors.add("RS-485错误");
        n = n << 1;
        if ((b & n) != 0)
            errors.add("进水错误");
        n = n << 1;
        if ((b & n) != 0)
            errors.add("断网时间错误");
        n = n << 1;
        if ((b & n) != 0)
            errors.add("滤芯堵塞");

        if (isP22) {
            n = n << 1;
            if ((b & n) != 0)
                errors.add("NTC保护");
            n = n << 1;
            if ((b & n) != 0)
                errors.add("模块异常（主板与GSM模块断开通信）");
        } else {
            n = n << 1;
            if ((b & n) != 0)
                errors.add("FLASH错误");
            n = n << 1;
            if ((b & n) != 0)
                errors.add("RC500模组异常");
        }
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
