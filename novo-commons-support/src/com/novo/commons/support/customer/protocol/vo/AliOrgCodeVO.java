package com.novo.commons.support.customer.protocol.vo;

/**
 * @author MickeyChen
 * @date 2020/12/20
 */
public class AliOrgCodeVO {

    private String username;

    private Long customerId;

    private String orgCode;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public String getOrgCode() {
        return orgCode;
    }

    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode;
    }

    @Override
    public String toString() {
        return "AliOrgCodeVO{" +
                "username='" + username + '\'' +
                ", customerId=" + customerId +
                ", orgCode='" + orgCode + '\'' +
                '}';
    }
}
