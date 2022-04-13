package com.novo.commons.support.customer.protocol.vo;

import com.novo.commons.enums.ThirdPlatformType;

import java.io.Serializable;

/**
 * @Author: duanwenyou
 * @Description:
 * @Date: Created in 10:30 2020/1/22
 */
public class ThirdPlatformVo implements Serializable{

    private Long id;
    /**
     * 登录账户id
     */
    private Long loginId;

    /**
     * 第三方平台类型（0微信，1支付宝，2QQ,3银行平台）
     */
    private ThirdPlatformType platformType;

    /**
     * 第三方平台id
     */
    private String platformId;

    /**
     * 第三方平台名称
     */
    private String platformName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getLoginId() {
        return loginId;
    }

    public void setLoginId(Long loginId) {
        this.loginId = loginId;
    }

    public ThirdPlatformType getPlatformType() {
        return platformType;
    }

    public void setPlatformType(ThirdPlatformType platformType) {
        this.platformType = platformType;
    }

    public String getPlatformId() {
        return platformId;
    }

    public void setPlatformId(String platformId) {
        this.platformId = platformId;
    }

    public String getPlatformName() {
        return platformName;
    }

    public void setPlatformName(String platformName) {
        this.platformName = platformName;
    }
}
