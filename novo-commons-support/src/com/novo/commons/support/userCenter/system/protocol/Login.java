package com.novo.commons.support.userCenter.system.protocol;

import com.novo.framework.core.protocol.RequestProtocol;

/**
 * @author of Aoheng
 * @TODO 登录实体
 * @date 2020-01-22 15:05
 **/

public class Login extends RequestProtocol {

    /** 
	* @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	*/ 
	private static final long serialVersionUID = 1L;
	public static final String BASE_FIELD_LOGINNAME = "loginName";
    public static final String BASE_FIELD_PASSWORD = "password";

    /**
     * 登录名
     */
    private String loginName;

    /**
     * 登录密码
     */
    private String password;

    /**
     * 登录电话
     */
    private String mobileNumber;

    /**
     * 组织id
     */
    private Long orgId;

    /**
     * 登录平台
     */
    private String platform;


    //*****************************************************************************************************


    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public Long getOrgId() {
        return orgId;
    }

    public void setOrgId(Long orgId) {
        this.orgId = orgId;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public static String getBaseFieldLoginname() {
        return BASE_FIELD_LOGINNAME;
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


}
