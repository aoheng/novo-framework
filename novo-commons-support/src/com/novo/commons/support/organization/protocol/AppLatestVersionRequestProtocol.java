package com.novo.commons.support.organization.protocol;

import com.novo.commons.support.app.AppBase;

import java.util.List;

/**
 * @Author: duanwenyou
 * @Description:
 * @Date: Created in 2020-08-21 11:08:51
 */
public class AppLatestVersionRequestProtocol extends AppBase {

    private static final long serialVersionUID = 1L;

    public static final String MY_FIELD_APP_SYSTEM = "appSystem";

    public static final String MY_FIELD_ORG_CODE = "orgCode";

    /**
     * 系统类型
     */
    private Integer appSystem;
    /**
     * 版本名称
     */
    private String orgCode;

    public Integer getAppSystem() {
        return appSystem;
    }

    public void setAppSystem(Integer appSystem) {
        this.appSystem = appSystem;
    }

    public String getOrgCode() {
        return orgCode;
    }

    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode;
    }
}

	
