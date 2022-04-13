package com.novo.commons.support.deviceCenter.protocol.vo;

import com.novo.commons.support.deviceCenter.vo.deviceDetails.FieldDetailInfo;

import java.io.Serializable;
import java.util.List;

/**
 * @author RaoYongBin on 2020/5/23
 */
public class DeviceDetailsVo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 动态展示的列名集合
     */
    private List<FieldDetailInfo> field;

    /**
     * 分页数据
     */
    private List<Object> data;

    /**
     * 设备产品代码
     */
    private Integer productCode;

    /**
     * 设备码
     */
    private String imeiCode;

    public DeviceDetailsVo() {
    }

    public DeviceDetailsVo(String imeiCode, Integer productCode) {
        this.imeiCode = imeiCode;
        this.productCode = productCode;
    }

    public List<FieldDetailInfo> getField() {
        return field;
    }

    public void setField(List<FieldDetailInfo> field) {
        this.field = field;
    }

    public List<Object> getData() {
        return data;
    }

    public void setData(List<Object> data) {
        this.data = data;
    }

    public Integer getProductCode() {
        return productCode;
    }

    public void setProductCode(Integer productCode) {
        this.productCode = productCode;
    }

    public String getImeiCode() {
        return imeiCode;
    }

    public void setImeiCode(String imeiCode) {
        this.imeiCode = imeiCode;
    }
}
