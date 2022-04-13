package com.novo.commons.support.dispatchCenter.system.protocol;

import com.novo.framework.core.protocol.PaginationResponseProtocol;

/**
 * @author of Aoheng
 * @TODO 安装师傅通知请求协议
 * @date 2020-04-26 10:54
 **/

public class EngineerRequestProtocol extends PaginationResponseProtocol {
    private static final long serialVersionUID = 1L;

    public static final String my_field_mobile = "mobile";

    /**
     * 客户手机
     */
    private String mobile;

    /**
     * 客户名称
     */
    private String customer;
    /**
     * 安装师傅
     */
    private String installName;
    /**
     * 安装师傅电话
     */
    private String instatllMobile;
    /**
     * 工单类型
     */
    private String type;
    /**
     * 工单编号
     */
    private String orderNo;
    /**
     * 地址
     */
    private String address;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public String getInstallName() {
        return installName;
    }

    public void setInstallName(String installName) {
        this.installName = installName;
    }

    public String getInstatllMobile() {
        return instatllMobile;
    }

    public void setInstatllMobile(String instatllMobile) {
        this.instatllMobile = instatllMobile;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
