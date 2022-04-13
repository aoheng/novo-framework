package com.novo.commons.support.deviceCenter.vo;

import java.io.Serializable;

/**
 * @author BinksRao
 * @date 2020/6/5
 */
public class DeviceModelVo implements Serializable {

    private static final long serialVersionUID = 1L;

    private String modelName;
    private Integer productCode;

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public Integer getProductCode() {
        return productCode;
    }

    public void setProductCode(Integer productCode) {
        this.productCode = productCode;
    }
}
