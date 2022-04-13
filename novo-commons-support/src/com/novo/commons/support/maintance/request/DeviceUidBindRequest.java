package com.novo.commons.support.maintance.request;

import com.novo.commons.support.maintance.SignVo;

/**
 * @author BinksRao on 2020/12/18
 */
public class DeviceUidBindRequest extends SignVo {

    public static final String my_field_uid = "uid";
    public static final String my_field_batchNo = "batchNo";

    private String orgCode;
    private String uid;
    private String deviceSn;
    private String imeiCode;
    private String batchNo;
    private String remark;

    public String getOrgCode() { return orgCode; }

    public void setOrgCode(String orgCode) { this.orgCode = orgCode; }

    public String getUid() { return uid; }

    public void setUid(String uid) { this.uid = uid; }

    public String getDeviceSn() { return deviceSn; }

    public void setDeviceSn(String deviceSn) { this.deviceSn = deviceSn; }

    public String getImeiCode() { return imeiCode; }

    public void setImeiCode(String imeiCode) { this.imeiCode = imeiCode; }

    public String getBatchNo() { return batchNo; }

    public void setBatchNo(String batchNo) { this.batchNo = batchNo; }

    public String getRemark() { return remark; }

    public void setRemark(String remark) { this.remark = remark; }
}
