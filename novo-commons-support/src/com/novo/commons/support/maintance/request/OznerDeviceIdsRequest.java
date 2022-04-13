package com.novo.commons.support.maintance.request;

import com.novo.commons.support.maintance.SignVo;

/**
 * @author MickeyChen
 * @date 2020/01/29
 */
public class OznerDeviceIdsRequest extends SignVo {


    public static final String my_field_deviceIds = "deviceIds";
    public static final String my_field_data = "data";
    private static final long serialVersionUID = 2588346963685401881L;
    private String ult;
    private String deviceIds;
    private String data;
    private String startTime;//yyyyMMddHHmmss

    public String getUlt() { return ult; }

    public void setUlt(String ult) { this.ult = ult; }

    public String getDeviceIds() {
        return deviceIds;
    }

    public void setDeviceIds(String deviceIds) {
        this.deviceIds = deviceIds;
    }


    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }


}
