package com.novo.commons.support.deviceCenter.vo.nbiot;

import java.util.List;

/**
 * @author MickeyChen
 * @date 2020/5/7
 */
public class DevicePageVO {

    private Integer totalCount;

    private Integer pageNo;

    private Integer pageSize;

    private List<DeviceDataVO> devices;

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public void setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public List<DeviceDataVO> getDevices() {
        return devices;
    }

    public void setDevices(List<DeviceDataVO> devices) {
        this.devices = devices;
    }
}
