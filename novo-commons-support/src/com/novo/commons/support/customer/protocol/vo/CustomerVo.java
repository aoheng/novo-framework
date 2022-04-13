package com.novo.commons.support.customer.protocol.vo;

import com.novo.commons.enums.CustType;
import com.novo.commons.enums.OrgStatus;

import java.io.Serializable;

/**
 * @Author: duanwenyou
 * @Description:
 * @Date: Created in 10:29 2020/1/22
 */
public class CustomerVo implements Serializable {

    private Long id;

    private Long orgId;

    private String orgName;

    /**
     * 身份证号
     */
    private String idCard;

    /**
     * 客户登录名
     */
    private String loginName;

    /**
     * 客户平台code
     */
    private String platformCode;

    private String platformName;

    /**
     * 客户电子邮件
     */
    private String email;

    /**
     * 客户姓名
     */
    private String realName;

    /**
     * 客户手机号
     */
    private String mobileNumber;

    /**
     * 详细地址(包含国家省市区地区详细地址)
     */
    private String areaCode;

    /**
     * 修改人
     */
    public Long modifierId;//修改者Id

    /**
     * 极光推送ID（app推送手机消息）
     */
    private String jpushId;

    private String orgCode;

    private OrgStatus orgStatus;

    private Boolean dataStatus;

    private CustType custType;

    public CustType getCustType() {
        return custType;
    }

    public void setCustType(CustType custType) {
        this.custType = custType;
    }

    public Boolean getDataStatus() {
        return dataStatus;
    }

    public void setDataStatus(Boolean dataStatus) {
        this.dataStatus = dataStatus;
    }

    public OrgStatus getOrgStatus() {
        return orgStatus;
    }

    public void setOrgStatus(OrgStatus orgStatus) {
        this.orgStatus = orgStatus;
    }

    public String getPlatformName() {
        return platformName;
    }

    public void setPlatformName(String platformName) {
        this.platformName = platformName;
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public Long getOrgId() {
        return orgId;
    }

    public void setOrgId(Long orgId) {
        this.orgId = orgId;
    }

    public String getOrgCode() {
        return orgCode;
    }

    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
