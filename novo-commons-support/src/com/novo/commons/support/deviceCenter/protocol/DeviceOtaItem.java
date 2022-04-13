package com.novo.commons.support.deviceCenter.protocol;

import java.io.Serializable;

/**
 * @author BinksRao
 * @date 2020/6/7
 */
public class DeviceOtaItem implements Serializable {
    private static final long serialVersionUID = 1L;

    private String imeiCode;

    private Integer productCode;

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
}
