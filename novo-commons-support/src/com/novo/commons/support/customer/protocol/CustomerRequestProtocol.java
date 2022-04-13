package com.novo.commons.support.customer.protocol;

import com.novo.commons.enums.CustType;
import com.novo.framework.core.protocol.PaginationRequestProtocol;


/**
 * @Author: duanwenyou
 * @Description:
 * @Date: Created in 14:02 2020/1/12
 */
public class CustomerRequestProtocol extends PaginationRequestProtocol {

    public static final String RESET_PASSWORD = "a111111";

    private Long orgId;

    private String idCard;

    private String loginName;

    private String platformCode;

    private String email;

    private String realName;

    private String password;

    private String pwdNew;//新密码，修改重置密码时使用

    private String mobileNumber;

    private String areaCode;

    public Long modifierId;//修改者Id

    private String jpushId;

    private String orgCode;

    private CustType custType;

    public CustType getCustType() {
        return custType;
    }

    public void setCustType(CustType custType) {
        this.custType = custType;
    }

    public Long getOrgId() {
        return orgId;
    }

    public void setOrgId(Long orgId) {
        this.orgId = orgId;
    }

    public String getPwdNew() {
        return pwdNew;
    }

    public void setPwdNew(String pwdNew) {
        this.pwdNew = pwdNew;
    }

    public String getOrgCode() {
        return orgCode;
    }

    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getLoginName() {
        return loginName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getPlatformCode() {
        return platformCode;
    }

    public void setPlatformCode(String platformCode) {
        this.platformCode = platformCode;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public Long getModifierId() {
        return modifierId;
    }

    public void setModifierId(Long modifierId) {
        this.modifierId = modifierId;
    }

    public void setAreaCode(String areaCode) {

        this.areaCode = areaCode;
    }

    public String getJpushId() {
        return jpushId;
    }

    public void setJpushId(String jpushId) {
        this.jpushId = jpushId;
    }
}
