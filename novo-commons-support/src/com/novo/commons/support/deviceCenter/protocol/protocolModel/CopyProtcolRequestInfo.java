package com.novo.commons.support.deviceCenter.protocol.protocolModel;

import java.io.Serializable;
import java.util.List;

/**
 * @author BinksRao on 2020/7/4
 */
public class CopyProtcolRequestInfo implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long oldId;
    private Long newId;
    private String orgCode;
    private Long creatorId;

    /**删除协议所有信息*/
    private List<Long> deleteIdList;

    public Long getOldId() {
        return oldId;
    }

    public void setOldId(Long oldId) {
        this.oldId = oldId;
    }

    public Long getNewId() {
        return newId;
    }

    public void setNewId(Long newId) {
        this.newId = newId;
    }

    public String getOrgCode() {
        return orgCode;
    }

    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode;
    }

    public Long getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(Long creatorId) {
        this.creatorId = creatorId;
    }

    public List<Long> getDeleteIdList() {
        return deleteIdList;
    }

    public void setDeleteIdList(List<Long> deleteIdList) {
        this.deleteIdList = deleteIdList;
    }
}
