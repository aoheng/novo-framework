package com.novo.commons.support.resources.protocol;

import com.novo.framework.core.protocol.PaginationRequestProtocol;

/**
 * @author of Aoheng
 * @TODO 平台资源中间表请求协议
 * @date 2020-04-13 11:14
 **/

public class PlatResourcesRequestProtocol extends PaginationRequestProtocol {

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
