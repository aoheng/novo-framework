package com.novo.commons.support.deviceCenter.vo;

import java.util.List;

/**
 * @author Aoheng on 2020/12/19.
 */
public class PpfResetVO {

    private String imeiCode;
    private List<PpfSimpleVO> ppfList;
    private Long activationHistoryId;

    public String getImeiCode() { return imeiCode; }

    public void setImeiCode(String imeiCode) { this.imeiCode = imeiCode; }

    public List<PpfSimpleVO> getPpfList() { return ppfList; }

    public void setPpfList(List<PpfSimpleVO> ppfList) { this.ppfList = ppfList; }

    public Long getActivationHistoryId() {
        return activationHistoryId;
    }

    public void setActivationHistoryId(Long activationHistoryId) {
        this.activationHistoryId = activationHistoryId;
    }
}
