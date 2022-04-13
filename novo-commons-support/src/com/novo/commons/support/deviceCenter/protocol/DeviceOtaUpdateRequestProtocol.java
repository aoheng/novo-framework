package com.novo.commons.support.deviceCenter.protocol;

import java.io.Serializable;
import java.util.List;

public class DeviceOtaUpdateRequestProtocol implements Serializable {
    private static final long serialVersionUID = 1L;

    private List<DeviceOtaItem> items;

    private Integer firmwareType;

    public List<DeviceOtaItem> getItems() {
        return items;
    }

    public void setItems(List<DeviceOtaItem> items) {
        this.items = items;
    }

    public Integer getFirmwareType() {
        return firmwareType;
    }

    public void setFirmwareType(Integer firmwareType) {
        this.firmwareType = firmwareType;
    }
}
