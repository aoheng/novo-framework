package com.novo.commons.support.deviceCenter.vo;

import com.novo.commons.support.deviceCenter.protocol.vo.DeviceProductCoreCycleVo;

import java.io.Serializable;
import java.util.List;

/**
 * @author BinksRao on 2020/12/19
 */
public class DNDeviceProductCoreCycleVo implements Serializable {

    private static final long serialVersionUID = 1L;

    private String deviceSn;
    private Integer productCode;
    private List<DeviceProductCoreCycleVo> productCoreCycleVoList;

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

    public List<DeviceProductCoreCycleVo> getProductCoreCycleVoList() {
        return productCoreCycleVoList;
    }

    public void setProductCoreCycleVoList(List<DeviceProductCoreCycleVo> productCoreCycleVoList) {
        this.productCoreCycleVoList = productCoreCycleVoList;
    }
}
