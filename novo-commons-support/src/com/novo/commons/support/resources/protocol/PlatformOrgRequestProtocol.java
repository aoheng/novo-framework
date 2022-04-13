package com.novo.commons.support.resources.protocol;

import com.novo.framework.core.protocol.PaginationRequestProtocol;

/**
 * @author of Aoheng
 * @TODO 平台组织协议
 * @date 2020-05-10 17:49
 **/

public class PlatformOrgRequestProtocol extends PaginationRequestProtocol {

    private static final long serialVersionUID = 1L;

    public Long id;

    /**
     * 平台id
     */
    private Long platformId;

    /**
     * 组织id
     */
    private Long orgId;

    /**
     * 平台code
     */
    private String platCode;

    /**
     * 平台名称
     */
    private String platName;


    /**
     * 组织名称
     */
    private String orgName;


    public String getPlatName() {
        return platName;
    }

    public void setPlatName(String platName) {
        this.platName = platName;
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    public Long getPlatformId() {
        return platformId;
    }

    public void setPlatformId(Long platformId) {
        this.platformId = platformId;
    }

    public Long getOrgId() {
        return orgId;
    }

    public void setOrgId(Long orgId) {
        this.orgId = orgId;
    }

    public String getPlatCode() {
        return platCode;
    }

    public void setPlatCode(String platCode) {
        this.platCode = platCode;
    }
}
