package com.novo.data.mongodb.entity;

import com.novo.data.mongodb.DeviceMongoBaseEntity;

import java.io.Serializable;

/**
 * @author Aoheng on 2021/01/30 2020/01/15.
 */
public class OtaUpdate extends DeviceMongoBaseEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    private Integer firmwareType;
    private String originVersion;
    private String newVersion;
    private Integer updateResult;
    private Integer failedReason;

    public Integer getFirmwareType() { return firmwareType; }

    public void setFirmwareType(Integer firmwareType) { this.firmwareType = firmwareType; }

    public String getOriginVersion() { return originVersion; }

    public void setOriginVersion(String originVersion) { this.originVersion = originVersion; }

    public String getNewVersion() { return newVersion; }

    public void setNewVersion(String newVersion) { this.newVersion = newVersion; }

    public Integer getUpdateResult() { return updateResult; }

    public void setUpdateResult(Integer updateResult) { this.updateResult = updateResult; }

    public Integer getFailedReason() { return failedReason; }

    public void setFailedReason(Integer failedReason) { this.failedReason = failedReason; }
}
