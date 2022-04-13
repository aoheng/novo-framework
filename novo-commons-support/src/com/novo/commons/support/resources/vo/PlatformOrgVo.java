package com.novo.commons.support.resources.vo;

import java.io.Serializable;
import java.util.List;

/**
 * @author of Aoheng
 * @TODO
 * @date 2020-05-10 17:52
 **/

public class PlatformOrgVo implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

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


    private String orgCode;


    private List<Long> orgIds;


    public List<Long> getOrgIds() {
        return orgIds;
    }

    public void setOrgIds(List<Long> orgIds) {
        this.orgIds = orgIds;
    }

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

    public Long getId() {
        return id;
    }

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

    public String getOrgCode() {
        return orgCode;
    }

    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode;
    }
}
