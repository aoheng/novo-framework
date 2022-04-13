package com.novo.commons.support.dispatchCenter.system.protocol;

import com.novo.framework.core.protocol.PaginationResponseProtocol;

/**
 * @author of Aoheng
 * @TODO 发票短信通知
 * @date 2020-04-26 10:52
 **/

public class InvoiceSmsRequestProtocol extends PaginationResponseProtocol {
    public static final String my_field_mobile = "mobile";

    /**
     * 手机号
     */
    private String mobile;
    /**
     * 发送时间
     */
    private String sendTime;

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getSendTime() {
        return sendTime;
    }

    public void setSendTime(String sendTime) {
        this.sendTime = sendTime;
    }

}
