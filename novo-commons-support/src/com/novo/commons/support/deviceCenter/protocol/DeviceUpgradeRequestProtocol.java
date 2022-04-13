package com.novo.commons.support.deviceCenter.protocol;


import com.novo.framework.core.protocol.PaginationRequestProtocol;

public class DeviceUpgradeRequestProtocol extends PaginationRequestProtocol {
    private static final long serialVersionUID = 1L;

    private String imeiCode;

    private Integer productCode;

    private String ctrlFirm;

    private String commuFirm;

    private String dispFirm;

    private String searchKey;
    private String hardwareFirm;
    private Integer startNum;

    public String getSearchKey() {
        return searchKey;
    }

    public void setSearchKey(String searchKey) {
        this.searchKey = searchKey;
    }

    public String getImeiCode() {
        return imeiCode;
    }

    public void setImeiCode(String imeiCode) {
        this.imeiCode = imeiCode;
    }

    public Integer getProductCode() {
        return productCode;
    }

    public void setProductCode(Integer productCode) {
        this.productCode = productCode;
    }

    public String getCtrlFirm() {
        return ctrlFirm;
    }

    public void setCtrlFirm(String ctrlFirm) {
        this.ctrlFirm = ctrlFirm;
    }

    public String getCommuFirm() {
        return commuFirm;
    }

    public void setCommuFirm(String commuFirm) {
        this.commuFirm = commuFirm;
    }

    public String getDispFirm() {
        return dispFirm;
    }

    public void setDispFirm(String dispFirm) {
        this.dispFirm = dispFirm;
    }

    public String getHardwareFirm() {
        return hardwareFirm;
    }

    public void setHardwareFirm(String hardwareFirm) {
        this.hardwareFirm = hardwareFirm;
    }

    public Integer getStartNum() {
        return startNum;
    }

    public void setStartNum(Integer startNum) {
        this.startNum = startNum;
    }
}
