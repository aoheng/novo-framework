package com.novo.commons.support.openApi.aliGenie.operate;

/**
 * @author MickeyChen
 * @date 2020/12/25
 */
public class AliGenieDishwasherVO {

    private Integer washRemainTime;
    private Integer door;
    private Integer childLock;
    private Integer actualTemp;
    private Integer power;
    private Integer currentWorkStatus;
    private String workMode;

    public Integer getWashRemainTime() {
        return washRemainTime;
    }

    public void setWashRemainTime(Integer washRemainTime) {
        this.washRemainTime = washRemainTime;
    }

    public Integer getDoor() {
        return door;
    }

    public void setDoor(Integer door) {
        this.door = door;
    }

    public Integer getChildLock() {
        return childLock;
    }

    public void setChildLock(Integer childLock) {
        this.childLock = childLock;
    }

    public Integer getActualTemp() {
        return actualTemp;
    }

    public void setActualTemp(Integer actualTemp) {
        this.actualTemp = actualTemp;
    }

    public Integer getPower() {
        return power;
    }

    public void setPower(Integer power) {
        this.power = power;
    }

    public Integer getCurrentWorkStatus() {
        return currentWorkStatus;
    }

    public void setCurrentWorkStatus(Integer currentWorkStatus) {
        this.currentWorkStatus = currentWorkStatus;
    }

    public String getWorkMode() {
        return workMode;
    }

    public void setWorkMode(String workMode) {
        this.workMode = workMode;
    }
}
