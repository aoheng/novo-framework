package com.novo.commons.support.deviceCenter.mqtt.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.novo.commons.support.deviceCenter.mqtt.bean.*;

import java.util.Date;

/**
 * @author Aoheng on 2020/10/30
 * 实时信息（DN）
 */
public class D1_g_DynamicCycleVO {

    /** 当前时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8:00")
    private Date currentTime;
    /** GPRS信号强度(CSQ) */
    private ByteGprs gprs;
    /** 开关位 */
    private D1_g_ByteArraySwitchFlag switchFlag;
    /** A滤芯剩余百分比 */
    private Integer coreR1Percent;
    /** B滤芯剩余百分比 */
    private Integer coreR2Percent;
    /** C滤芯剩余百分比 */
    private Integer coreR3Percent;
    /** D滤芯剩余百分比 */
    private Integer coreR4Percent;
    /** 总断网时长 */
    private Long disconnectInterval;
    /** 累计用水量 */
    private Long totalWaterConsumption;
    /** 当前温度 */
    private Integer currentTemp;
    /** 当前温度模式 */
    private D1_g_ByteArrayTempMode tempMode;
    /** 加热温度 */
    private Integer heatingTemp;
    /** 错误代码 */
    private D1_g_ByteArrayErrorCode errorCode;
    /** 滤芯信息 */
    private D4_ByteArrayPpfDetails ppfDetails;
    /** 滤芯套餐 */
    private Integer ppfPackage;
    /** 补水温度差值 */
    private Integer waterTempDiffer;
    /** 最高显示温度 */
    private Integer highestTemp;
    /** TD1 */
    private Integer td1;
    /** TD2 */
    private Integer td2;
    /** 水箱液位状态 */
    private Integer liquidStatus;
    /** 套餐模式 */
    private Integer chargeMode;
    /** 出水量（单位/毫升） */
    private Long flowWaterConsumption;
    /** 剩余水量（单位/毫升） */
    private Long cardRemain;

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

    public D1_g_ByteArraySwitchFlag getSwitchFlag() {
        return switchFlag;
    }

    public void setSwitchFlag(D1_g_ByteArraySwitchFlag switchFlag) {
        this.switchFlag = switchFlag;
    }

    public Integer getCoreR1Percent() {
        return coreR1Percent;
    }

    public void setCoreR1Percent(Integer coreR1Percent) {
        this.coreR1Percent = coreR1Percent;
    }

    public Integer getCoreR2Percent() {
        return coreR2Percent;
    }

    public void setCoreR2Percent(Integer coreR2Percent) {
        this.coreR2Percent = coreR2Percent;
    }

    public Integer getCoreR3Percent() {
        return coreR3Percent;
    }

    public void setCoreR3Percent(Integer coreR3Percent) {
        this.coreR3Percent = coreR3Percent;
    }

    public Integer getCoreR4Percent() {
        return coreR4Percent;
    }

    public void setCoreR4Percent(Integer coreR4Percent) {
        this.coreR4Percent = coreR4Percent;
    }

    public Long getDisconnectInterval() {
        return disconnectInterval;
    }

    public void setDisconnectInterval(Long disconnectInterval) {
        this.disconnectInterval = disconnectInterval;
    }

    public Long getTotalWaterConsumption() {
        return totalWaterConsumption;
    }

    public void setTotalWaterConsumption(Long totalWaterConsumption) {
        this.totalWaterConsumption = totalWaterConsumption;
    }

    public Integer getCurrentTemp() {
        return currentTemp;
    }

    public void setCurrentTemp(Integer currentTemp) {
        this.currentTemp = currentTemp;
    }

    public D1_g_ByteArrayTempMode getTempMode() {
        return tempMode;
    }

    public void setTempMode(D1_g_ByteArrayTempMode tempMode) {
        this.tempMode = tempMode;
    }

    public Integer getHeatingTemp() {
        return heatingTemp;
    }

    public void setHeatingTemp(Integer heatingTemp) {
        this.heatingTemp = heatingTemp;
    }

    public D1_g_ByteArrayErrorCode getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(D1_g_ByteArrayErrorCode errorCode) {
        this.errorCode = errorCode;
    }

    public D4_ByteArrayPpfDetails getPpfDetails() {
        return ppfDetails;
    }

    public void setPpfDetails(D4_ByteArrayPpfDetails ppfDetails) {
        this.ppfDetails = ppfDetails;
    }

    public Integer getPpfPackage() {
        return ppfPackage;
    }

    public void setPpfPackage(Integer ppfPackage) {
        this.ppfPackage = ppfPackage;
    }

    public Integer getWaterTempDiffer() {
        return waterTempDiffer;
    }

    public void setWaterTempDiffer(Integer waterTempDiffer) {
        this.waterTempDiffer = waterTempDiffer;
    }

    public Integer getHighestTemp() {
        return highestTemp;
    }

    public void setHighestTemp(Integer highestTemp) {
        this.highestTemp = highestTemp;
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

    public Integer getLiquidStatus() {
        return liquidStatus;
    }

    public void setLiquidStatus(Integer liquidStatus) {
        this.liquidStatus = liquidStatus;
    }

    public Integer getChargeMode() {
        return chargeMode;
    }

    public void setChargeMode(Integer chargeMode) {
        this.chargeMode = chargeMode;
    }

    public Long getFlowWaterConsumption() {
        return flowWaterConsumption;
    }

    public void setFlowWaterConsumption(Long flowWaterConsumption) {
        this.flowWaterConsumption = flowWaterConsumption;
    }

    public Long getCardRemain() {
        return cardRemain;
    }

    public void setCardRemain(Long cardRemain) {
        this.cardRemain = cardRemain;
    }
}
