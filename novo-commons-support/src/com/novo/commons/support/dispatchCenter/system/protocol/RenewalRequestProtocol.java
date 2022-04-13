package com.novo.commons.support.dispatchCenter.system.protocol;

import com.novo.framework.core.protocol.PaginationResponseProtocol;

import java.util.List;

/**
 * @author of Aoheng
 * @TODO 续费请求协议
 * @date 2020-04-26 10:49
 **/

public class RenewalRequestProtocol extends PaginationResponseProtocol {

    private static final long serialVersionUID = 7210530927875330866L;
    public static final String my_field_mobile = "mobile";

    private String days;               //距离到期天数
    private List<String> mobileList;   //手机集合

    public String getDays() {
        return days;
    }

    public void setDays(String days) {
        this.days = days;
    }

    public List<String> getMobileList() {
        return mobileList;
    }

    public void setMobileList(List<String> mobileList) {
        this.mobileList = mobileList;
    }

}
