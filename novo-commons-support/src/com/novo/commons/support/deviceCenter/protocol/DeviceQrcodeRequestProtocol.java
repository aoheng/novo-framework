package com.novo.commons.support.deviceCenter.protocol;


import com.novo.commons.support.deviceCenter.protocol.vo.DeviceQrcodeVo;
import com.novo.framework.core.protocol.PaginationRequestProtocol;

import java.util.List;

public class DeviceQrcodeRequestProtocol extends PaginationRequestProtocol {

    private static final long serialVersionUID = 1L;

	public static final String DEVICE_SN = "deviceSn";

    private Long id;//主键ID
    private String deviceSn;//设备编号
    private String deviceQrcode;//设备编号二维码
    private Integer printStatus;//二维码打印状态(0未打印，1已打印）
    private List<DeviceQrcodeVo> deviceQrcodeVoList;

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    public String getDeviceSn() {
        return deviceSn;
    }

    public void setDeviceSn(String deviceSn) {
        this.deviceSn = deviceSn;
    }

    public String getDeviceQrcode() {
        return deviceQrcode;
    }

    public void setDeviceQrcode(String deviceQrcode) {
        this.deviceQrcode = deviceQrcode;
    }

    public Integer getPrintStatus() {
        return printStatus;
    }

    public void setPrintStatus(Integer printStatus) {
        this.printStatus = printStatus;
    }

    public List<DeviceQrcodeVo> getDeviceQrcodeVoList() { return deviceQrcodeVoList; }

    public void setDeviceQrcodeVoList(List<DeviceQrcodeVo> deviceQrcodeVoList) { this.deviceQrcodeVoList = deviceQrcodeVoList; }
}
