package com.novo.commons.support.deviceCenter.mqtt.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.novo.commons.support.deviceCenter.mqtt.bean.*;

import java.util.Date;

/**
 * @author Aoheng on 2020/10/30
 * 实时信息（浩泽二代机）
 */
public class D1_f_DynamicCycleVO {

    /** 当前时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8:00")
    private Date currentTime;
    /** GPRS信号强度(CSQ) */
    private ByteGprs gprs;
    /** 开关位 */
    private D1_f_ByteArraySwitchFlag switchFlag;
    /** 杀菌参数 */
    private D1_ByteArraySterilization sterilization;
    /** TDS1 */
    private Integer td1;
    /** TDS2 */
    private Integer td2;
    /** TDS校准比例值 */
    private D1_f_ByteArrayTdsAdjust tdsAdjust;
    /** 节水比率 */
    private Integer waterSavingRate;
    /** 累计用水量 */
    private Long totalWaterConsumption;
    /** 温度信息 */
    private Integer tempInfo;
    /** 加热状态 */
    private Integer heatingStatus;
    /** 液位状态 */
    private Integer liquidLevel;
    /** 错误代码 */
    private D1_f_ByteArrayErrorCode errorCode;


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

    public D1_f_ByteArraySwitchFlag getSwitchFlag() {
        return switchFlag;
    }

    public void setSwitchFlag(D1_f_ByteArraySwitchFlag switchFlag) {
        this.switchFlag = switchFlag;
    }

    public D1_ByteArraySterilization getSterilization() {
        return sterilization;
    }

    public void setSterilization(D1_ByteArraySterilization sterilization) {
        this.sterilization = sterilization;
    }

    public Integer getTd1() {
        return td1;
    }

    public void setTd1(Integer td1) {
        this.td1 = td1;
    }

    public Integer getTd2() {
        return td2;
    }

    public void setTd2(Integer td2) {
        this.td2 = td2;
    }

    public D1_f_ByteArrayTdsAdjust getTdsAdjust() {
        return tdsAdjust;
    }

    public void setTdsAdjust(D1_f_ByteArrayTdsAdjust tdsAdjust) {
        this.tdsAdjust = tdsAdjust;
    }

    public Integer getWaterSavingRate() {
        return waterSavingRate;
    }

    public void setWaterSavingRate(Integer waterSavingRate) {
        this.waterSavingRate = waterSavingRate;
    }

    public Long getTotalWaterConsumption() {
        return totalWaterConsumption;
    }

    public void setTotalWaterConsumption(Long totalWaterConsumption) {
        this.totalWaterConsumption = totalWaterConsumption;
    }

    public Integer getTempInfo() {
        return tempInfo;
    }

    public void setTempInfo(Integer tempInfo) {
        this.tempInfo = tempInfo;
    }

    public Integer getHeatingStatus() {
        return heatingStatus;
    }

    public void setHeatingStatus(Integer heatingStatus) {
        this.heatingStatus = heatingStatus;
    }

    public Integer getLiquidLevel() {
        return liquidLevel;
    }

    public void setLiquidLevel(Integer liquidLevel) {
        this.liquidLevel = liquidLevel;
    }

    public D1_f_ByteArrayErrorCode getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(D1_f_ByteArrayErrorCode errorCode) {
        this.errorCode = errorCode;
    }
}
