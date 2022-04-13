package com.novo.commons.support.deviceCenter.mqtt.bean;

import com.novo.framework.core.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Aoheng on 2021/01/31.
 * 错误代码
 */
public class D1_e_ByteArrayErrorCode {

    private List<String> errors;

    public D1_e_ByteArrayErrorCode() {}

    public D1_e_ByteArrayErrorCode(byte[] bytes) {
        errors = new ArrayList<>();

        byte b = bytes[0];
        int n = 0x01;
        if ((b & n) != 0)
            errors.add("水杯制水错误");
        n = n << 1;
        if ((b & n) != 0)
            errors.add("压力罐制水错误");
        n = n << 1;
        if ((b & n) != 0)
            errors.add("水杯液位检测错误");
        n = n << 1;
        if ((b & n) != 0)
            errors.add("进水错误");
        n = n << 1;
        if ((b & n) != 0)
            errors.add("增压泵错误");
        n = n << 1;
        if ((b & n) != 0)
            errors.add("放水错误");
        n = n << 1;
        if ((b & n) != 0)
            errors.add("冲洗错误");
        n = n << 1;
        if ((b & n) != 0)
            errors.add("滤芯堵塞");

        b = bytes[1];
        n = 0x01;
        if ((b & n) != 0)
            errors.add("时间同步错误");
        n = n << 1;
        if ((b & n) != 0)
            errors.add("RTC错误");
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
