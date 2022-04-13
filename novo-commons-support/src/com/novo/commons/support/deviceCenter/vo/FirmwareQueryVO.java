package com.novo.commons.support.deviceCenter.vo;

/**
 * @author Aoheng on 2020/12/19.
 */
public class FirmwareQueryVO {

    private Integer productCode;
    /** 更新部件（0：通讯主板 1：控制版  2：显示板） */
    private Integer firmwareType;

    public Integer getProductCode() { return productCode; }

    public void setProductCode(Integer productCode) { this.productCode = productCode; }

    public Integer getFirmwareType() { return firmwareType; }

    public void setFirmwareType(Integer firmwareType) { this.firmwareType = firmwareType; }
}
