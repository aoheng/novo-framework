package com.novo.commons.support.deviceCenter.protocol;

import com.novo.commons.support.deviceCenter.vo.PpfResetVO;
import com.novo.framework.core.protocol.PaginationRequestProtocol;

/**
 * @author BinksRao on 2020/9/10
 */
public class DevicePpfAuthenticationRequestProtocol extends PaginationRequestProtocol {
    private static final long serialVersionUID = 1L;

    /**绑定设备编号*/
    private String deviceSn;
    /**设备imei*/
    private String imeiCode;
    /**设备类型：1-净水器 2-洗碗机*/
    private Integer deviceType;
    /** 产品代码 */
    private Integer productCode;
    /**滤芯编码*/
    private String ppfSn;
    /**滤芯类型*/
    private String ppfType;
    /**防伪key*/
    private String antifakeKey;
    /**使用状态*/
    private Integer useNum;
    /**重置成功时间*/
    private String resetSuccessTime;

    //滤芯重置vo
    private PpfResetVO ppfResetVO;


    public String getDeviceSn() {
        return deviceSn;
    }

    public void setDeviceSn(String deviceSn) {
        this.deviceSn = deviceSn;
    }

    public Integer getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(Integer deviceType) {
        this.deviceType = deviceType;
    }

    public String getPpfSn() {
        return ppfSn;
    }

    public void setPpfSn(String ppfSn) {
        this.ppfSn = ppfSn;
    }

    public String getPpfType() {
        return ppfType;
    }

    public void setPpfType(String ppfType) {
        this.ppfType = ppfType;
    }

    public String getAntifakeKey() {
        return antifakeKey;
    }

    public void setAntifakeKey(String antifakeKey) {
        this.antifakeKey = antifakeKey;
    }

    public Integer getUseNum() {
        return useNum;
    }

    public void setUseNum(Integer useNum) {
        this.useNum = useNum;
    }

    public String getResetSuccessTime() {
        return resetSuccessTime;
    }

    public void setResetSuccessTime(String resetSuccessTime) {
        this.resetSuccessTime = resetSuccessTime;
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

    public PpfResetVO getPpfResetVO() {
        return ppfResetVO;
    }

    public void setPpfResetVO(PpfResetVO ppfResetVO) {
        this.ppfResetVO = ppfResetVO;
    }
}
