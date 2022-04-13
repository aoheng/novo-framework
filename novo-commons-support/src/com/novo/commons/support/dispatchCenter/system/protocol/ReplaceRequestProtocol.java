package com.novo.commons.support.dispatchCenter.system.protocol;

import com.novo.framework.core.protocol.PaginationResponseProtocol;

/**
 * @author of Aoheng
 * @TODO 换芯通知请求协议
 * @date 2020-04-26 10:50
 **/

public class ReplaceRequestProtocol extends PaginationResponseProtocol {
    private static final long serialVersionUID = 1L;

    public static final String my_field_mobile = "mobile";

    /**
     * 距离到期天数
     */
    private Integer days;
    /**
     * 滤芯类型（PPF，CC，RO）
     */
    private String type;
    /**
     * 手机
     */
    private String mobile;             

    public Integer getDays() {
        return days;
    }

    public void setDays(Integer days) {
        this.days = days;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

}
