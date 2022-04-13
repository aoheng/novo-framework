package com.novo.commons.support.customer.protocol;

import com.novo.commons.enums.ThirdPlatformType;
import com.novo.framework.core.protocol.PaginationRequestProtocol;

/**
 * @Author: duanwenyou
 * @Description:
 * @Date: Created in 10:25 2020/1/22
 */
public class ThirdPlatformRequestProtocol extends PaginationRequestProtocol{

    private Long loginId;

    private ThirdPlatformType platformType;

    private String platformId;

    private String platformName;

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
