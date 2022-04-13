package com.novo.commons.support.deviceCenter.vo.nbiot;

import java.util.List;
import java.util.Map;

/**
 * @author MickeyChen
 * @date 2020/5/7
 */
public class DeviceDataVO {

    private String deviceId;

    private String gatewayId;

    private String nodeType;

    private String createTime;

    private String lastModifiedTime;

    private DeviceInfo deviceInfo;

    private List<Services> services;

    private Map<String, Object> connectionInfo;

    private List<String> devGroupIds;

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getGatewayId() {
        return gatewayId;
    }

    public void setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
    }

    public String getNodeType() {
        return nodeType;
    }

    public void setNodeType(String nodeType) {
        this.nodeType = nodeType;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getLastModifiedTime() {
        return lastModifiedTime;
    }

    public void setLastModifiedTime(String lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    public DeviceInfo getDeviceInfo() {
        return deviceInfo;
    }

    public void setDeviceInfo(DeviceInfo deviceInfo) {
        this.deviceInfo = deviceInfo;
    }

    public List<Services> getServices() {
        return services;
    }

    public void setServices(List<Services> services) {
        this.services = services;
    }

    public Map<String, Object> getConnectionInfo() {
        return connectionInfo;
    }

    public void setConnectionInfo(Map<String, Object> connectionInfo) {
        this.connectionInfo = connectionInfo;
    }

    public List<String> getDevGroupIds() {
        return devGroupIds;
    }

    public void setDevGroupIds(List<String> devGroupIds) {
        this.devGroupIds = devGroupIds;
    }
}
