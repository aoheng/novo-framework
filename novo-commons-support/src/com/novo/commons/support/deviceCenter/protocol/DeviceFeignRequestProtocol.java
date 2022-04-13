package com.novo.commons.support.deviceCenter.protocol;

import java.io.Serializable;
import java.util.List;

/**
 * @author BinksRao on 2020/9/4
 */
public class DeviceFeignRequestProtocol implements Serializable {
    private static final long serialVersionUID = 1L;

    private String orgCode;
    private String imeiCode;
    private String deviceSn;
    private Integer productCode;
    private List<String> paramList;

    public String getOrgCode() {
        return orgCode;
    }

    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode;
    }

    public String getImeiCode() {
        return imeiCode;
    }

    public void setImeiCode(String imeiCode) {
        this.imeiCode = imeiCode;
    }

    public String getDeviceSn() {
        return deviceSn;
    }

    public void setDeviceSn(String deviceSn) {
        this.deviceSn = deviceSn;
    }

    public Integer getProductCode() {
        return productCode;
    }

    public void setProductCode(Integer productCode) {
        this.productCode = productCode;
    }

    public List<String> getParamList() {
        return paramList;
    }

    public void setParamList(List<String> paramList) {
        this.paramList = paramList;
    }
}
