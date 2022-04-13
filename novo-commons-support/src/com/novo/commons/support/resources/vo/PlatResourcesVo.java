package com.novo.commons.support.resources.vo;

import java.io.Serializable;

/**
 * @author of Aoheng
 * @TODO 平台资源Vo
 * @date 2020-04-13 11:16
 **/

public class PlatResourcesVo implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 平台id
     */
    private Long platformId;

    /**
     * 资源id
     */
    private Long resourcesId;

    /**
     * 平台code
     */
    private String platformCode;

    public Long getPlatformId() {
        return platformId;
    }

    public void setPlatformId(Long platformId) {
        this.platformId = platformId;
    }

    public Long getResourcesId() {
        return resourcesId;
    }

    public void setResourcesId(Long resourcesId) {
        this.resourcesId = resourcesId;
    }

    public String getPlatformCode() {
        return platformCode;
    }

    public void setPlatformCode(String platformCode) {
        this.platformCode = platformCode;
    }
}
