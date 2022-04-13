package com.novo.commons.support.resources.protocol;

import com.novo.framework.core.protocol.PaginationRequestProtocol;

/**
 * @author of Aoheng
 * @TODO 向导所有参数
 * @date 2020-11-27 14:06
 **/

public class AllGuideRequestProtocol extends PaginationRequestProtocol {
    private Long id;
    //*********************************组织参数********************************************************************
    /**
     * 组织名称
     */
    private String orgName;
    /**
     * 组织负责人
     */
    private String orgRepresentative;
    /**
     * 组织电话
     */
    private String telNumber;
    /**
     * 组织地址
     */
    private String orgAddress;

    /**
     * 组织logo图片
     */
    private String logoPic;
    /**
     * 组织域名
     */
    private String realm;
    /**
     * 父级组织id
     */
    private Long parentId;
    //**************************************平台参数***************************************************************

    /**
     * 平台名称
     */
    private String platName;
    /**
     * 平台资源id
     */
    private Long[] resourceId;

    /**
     * 平台类型(云系统:S0001,运营后台系统,Y0001,运营商系统,Z0001)
     */
    private String platTypeEnum;
    //******************************************管理员参数***********************************************************
    /**
     * 用户名
     */
    private String loginName;
    /**
     * 密码
     */
    private String password;
    /**
     * 电话
     */
    private String mobileNumber;
    /**
     * 邮箱
     */
    private String email;

    //*****************************************************************************************************


    public String getPlatTypeEnum() {
        return platTypeEnum;
    }

    public void setPlatTypeEnum(String platTypeEnum) {
        this.platTypeEnum = platTypeEnum;
    }

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    public String getLogoPic() {
        return logoPic;
    }

    public void setLogoPic(String logoPic) {
        this.logoPic = logoPic;
    }

    public String getRealm() {
        return realm;
    }

    public void setRealm(String realm) {
        this.realm = realm;
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public String getOrgRepresentative() {
        return orgRepresentative;
    }

    public void setOrgRepresentative(String orgRepresentative) {
        this.orgRepresentative = orgRepresentative;
    }

    public String getTelNumber() {
        return telNumber;
    }

    public void setTelNumber(String telNumber) {
        this.telNumber = telNumber;
    }

    public String getOrgAddress() {
        return orgAddress;
    }

    public void setOrgAddress(String orgAddress) {
        this.orgAddress = orgAddress;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public String getPlatName() {
        return platName;
    }

    public void setPlatName(String platName) {
        this.platName = platName;
    }

    public Long[] getResourceId() {
        return resourceId;
    }

    public void setResourceId(Long[] resourceId) {
        this.resourceId = resourceId;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
