package com.novo.commons.support.deviceCenter.mqtt.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.novo.commons.support.deviceCenter.mqtt.bean.*;

import java.util.Date;

/**
 * @author Aoheng on 2020/10/30
 * 实时信息（洗碗机）
 */
public class D2_DynamicCycleVO {

    /** 当前时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8:00")
    private Date currentTime;
    /** GPRS信号强度 */
    private ByteGprs gprs;
    /** 开关位 */
    private D2_ByteArraySwitchFlag switchFlag;
    /** 工作模式 */
    private Integer workMode;
    /** 保管功能 */
    private D2_ByteArrayStorage storage;
    /** 保管功能时间值 */
    private Integer storageTime;
    /** 保管功能时间间隔 */
    private Integer storageInterval;
    /** 预约开启洗碗时间 */
    private ByteArrayHourMin bookingWashTime;
    /** 预约开启洗碗的模式 */
    private Integer bookingWorkMode;
    /** 洗涤剩余时间 */
    private Integer washRemainTime;
    /** 滤芯状态 */
    private D2_BytePpfState ppfState;
    /** 滤芯详细信息 */
    private D2_ByteArrayPpfDetails ppfDetails;
    /** 实时温度 */
    private Integer actualTemp;
    /** 主洗目标温度 */
    private Integer washTemp;
    /** 漂洗目标温度 */
    private Integer rinseTemp;
    /** 洗涤阶段 */
    private Integer washPhase;
    /** 预洗浊度判定值 */
    private Integer preWashTurbidity;
    /** 主洗浊度判定值 */
    private Integer mainWashTurbidity;
    /** 漂洗结束的浑浊度 */
    private Integer endWashTurbidity;
    /** 错误代码 */
    private D2_ByteArrayErrorCode errorCode;
    /** 当前工作状态 */
    private D2_ByteCurrentWorkStatus currentWorkStatus;
    /** 滤芯渠道信息  */
    private D2_ByteArrayFilterOperator filterOperator;

    public Date getCurrentTime() {
        return currentTime;
    }

    public void setCurrentTime(Date currentTime) {
        this.currentTime = currentTime;
    }

    public ByteGprs getGprs() {
        return gprs;
    }

    public void setGprs(ByteGprs gprs) {
        this.gprs = gprs;
    }

    public D2_ByteArraySwitchFlag getSwitchFlag() {
        return switchFlag;
    }

    public void setSwitchFlag(D2_ByteArraySwitchFlag switchFlag) {
        this.switchFlag = switchFlag;
    }

    public Integer getWorkMode() {
        return workMode;
    }

    public void setWorkMode(Integer workMode) {
        this.workMode = workMode;
    }

    public D2_ByteArrayStorage getStorage() {
        return storage;
    }

    public void setStorage(D2_ByteArrayStorage storage) {
        this.storage = storage;
    }

    public Integer getStorageTime() {
        return storageTime;
    }

    public void setStorageTime(Integer storageTime) {
        this.storageTime = storageTime;
    }

    public Integer getStorageInterval() {
        return storageInterval;
    }

    public void setStorageInterval(Integer storageInterval) {
        this.storageInterval = storageInterval;
    }

    public ByteArrayHourMin getBookingWashTime() {
        return bookingWashTime;
    }

    public void setBookingWashTime(ByteArrayHourMin bookingWashTime) {
        this.bookingWashTime = bookingWashTime;
    }

    public Integer getBookingWorkMode() {
        return bookingWorkMode;
    }

    public void setBookingWorkMode(Integer bookingWorkMode) {
        this.bookingWorkMode = bookingWorkMode;
    }

    public Integer getWashRemainTime() {
        return washRemainTime;
    }

    public void setWashRemainTime(Integer washRemainTime) {
        this.washRemainTime = washRemainTime;
    }

    public D2_BytePpfState getPpfState() {
        return ppfState;
    }

    public void setPpfState(D2_BytePpfState ppfState) {
        this.ppfState = ppfState;
    }

    public D2_ByteArrayPpfDetails getPpfDetails() {
        return ppfDetails;
    }

    public void setPpfDetails(D2_ByteArrayPpfDetails ppfDetails) {
        this.ppfDetails = ppfDetails;
    }

    public Integer getActualTemp() {
        return actualTemp;
    }

    public void setActualTemp(Integer actualTemp) {
        this.actualTemp = actualTemp;
    }

    public Integer getWashTemp() {
        return washTemp;
    }

    public void setWashTemp(Integer washTemp) {
        this.washTemp = washTemp;
    }

    public Integer getRinseTemp() {
        return rinseTemp;
    }

    public void setRinseTemp(Integer rinseTemp) {
        this.rinseTemp = rinseTemp;
    }

    public Integer getWashPhase() {
        return washPhase;
    }

    public void setWashPhase(Integer washPhase) {
        this.washPhase = washPhase;
    }

    public Integer getPreWashTurbidity() {
        return preWashTurbidity;
    }

    public void setPreWashTurbidity(Integer preWashTurbidity) {
        this.preWashTurbidity = preWashTurbidity;
    }

    public Integer getMainWashTurbidity() {
        return mainWashTurbidity;
    }

    public void setMainWashTurbidity(Integer mainWashTurbidity) {
        this.mainWashTurbidity = mainWashTurbidity;
    }

    public Integer getEndWashTurbidity() {
        return endWashTurbidity;
    }

    public void setEndWashTurbidity(Integer endWashTurbidity) {
        this.endWashTurbidity = endWashTurbidity;
    }

    public D2_ByteArrayErrorCode getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(D2_ByteArrayErrorCode errorCode) {
        this.errorCode = errorCode;
    }

    public D2_ByteCurrentWorkStatus getCurrentWorkStatus() {
        return currentWorkStatus;
    }

    public void setCurrentWorkStatus(D2_ByteCurrentWorkStatus currentWorkStatus) {
        this.currentWorkStatus = currentWorkStatus;
    }

    public D2_ByteArrayFilterOperator getFilterOperator() {
        return filterOperator;
    }

    public void setFilterOperator(D2_ByteArrayFilterOperator filterOperator) {
        this.filterOperator = filterOperator;
    }
}
