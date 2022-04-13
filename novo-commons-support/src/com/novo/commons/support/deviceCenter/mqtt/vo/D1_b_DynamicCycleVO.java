package com.novo.commons.support.deviceCenter.mqtt.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.novo.commons.support.deviceCenter.mqtt.bean.*;

import java.util.Date;

/**
 * @author Aoheng on 2020/10/30
 * 实时信息（碧丽三出水）
 */
public class D1_b_DynamicCycleVO {

    /** 当前时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8:00")
    private Date currentTime;
    /** 开关位 */
    private D1_b_ByteArraySwitchFlag switchFlag;
    /** 滤芯A剩余百分比 */
    private Integer coreR1Percent;
    /** 滤芯B剩余百分比 */
    private Integer coreR2Percent;
    /** 滤芯C剩余百分比 */
    private Integer coreR3Percent;
    /** 滤芯D剩余百分比 */
    private Integer coreR4Percent;
    /** 滤芯E剩余百分比 */
    private Integer coreR5Percent;
    /** 错误代码 */
    private D1_b_ByteArrayErrorCode errorCode;
    /** 总断网时长 */
    private Long disconnectInterval;
    /** GPRS信号强度(CSQ) */
    private ByteGprs gprs;
    /** 当前温度 */
    private Integer currentTemp;
    /** 出水口 */
    private Integer outlet;
    /** 出水量（单位/毫升） */
    private Long flowWaterConsumption;
    /** 用户卡号 */
    private Long cardNum;
    /** 用户卡剩余水量（单位/毫升） */
    private Long cardRemain;
    /** 用户卡充值时间 */
    private Date cardRechargeTime;
    /** 加热开关（0：关 1：开） */
    private Integer heatingSwitch;
    /** 加热定时开始结束时分 */
    private ByteArrayPlanTime heatingPlanTime;
    /** 温度模式 */
    private D1_b_ByteArrayTempMode tempMode;
    /** 保温（0：关 1：开） */
    private Integer keepWarm;

    public Integer getKeepWarm() { return keepWarm; }

    public void setKeepWarm(Integer keepWarm) { this.keepWarm = keepWarm; }

    public Integer getHeatingSwitch() { return heatingSwitch; }

    public void setHeatingSwitch(Integer heatingSwitch) { this.heatingSwitch = heatingSwitch; }

    public ByteArrayPlanTime getHeatingPlanTime() { return heatingPlanTime; }

    public void setHeatingPlanTime(ByteArrayPlanTime heatingPlanTime) { this.heatingPlanTime = heatingPlanTime; }

    public D1_b_ByteArrayTempMode getTempMode() { return tempMode; }

    public void setTempMode(D1_b_ByteArrayTempMode tempMode) { this.tempMode = tempMode; }

    public Date getCurrentTime() { return currentTime; }

    public void setCurrentTime(Date currentTime) { this.currentTime = currentTime; }

    public D1_b_ByteArraySwitchFlag getSwitchFlag() { return switchFlag; }

    public void setSwitchFlag(D1_b_ByteArraySwitchFlag switchFlag) { this.switchFlag = switchFlag; }

    public Integer getCoreR1Percent() { return coreR1Percent; }

    public void setCoreR1Percent(Integer coreR1Percent) { this.coreR1Percent = coreR1Percent; }

    public Integer getCoreR2Percent() { return coreR2Percent; }

    public void setCoreR2Percent(Integer coreR2Percent) { this.coreR2Percent = coreR2Percent; }

    public Integer getCoreR3Percent() { return coreR3Percent; }

    public void setCoreR3Percent(Integer coreR3Percent) { this.coreR3Percent = coreR3Percent; }

    public Integer getCoreR4Percent() { return coreR4Percent; }

    public void setCoreR4Percent(Integer coreR4Percent) { this.coreR4Percent = coreR4Percent; }

    public Integer getCoreR5Percent() { return coreR5Percent; }

    public void setCoreR5Percent(Integer coreR5Percent) { this.coreR5Percent = coreR5Percent; }

    public D1_b_ByteArrayErrorCode getErrorCode() { return errorCode; }

    public void setErrorCode(D1_b_ByteArrayErrorCode errorCode) { this.errorCode = errorCode; }

    public Long getDisconnectInterval() { return disconnectInterval; }

    public void setDisconnectInterval(Long disconnectInterval) { this.disconnectInterval = disconnectInterval; }

    public ByteGprs getGprs() { return gprs; }

    public void setGprs(ByteGprs gprs) { this.gprs = gprs; }

    public Integer getCurrentTemp() { return currentTemp; }

    public void setCurrentTemp(Integer currentTemp) { this.currentTemp = currentTemp; }

    public Integer getOutlet() { return outlet; }

    public void setOutlet(Integer outlet) { this.outlet = outlet; }

    public Long getFlowWaterConsumption() { return flowWaterConsumption; }

    public void setFlowWaterConsumption(Long flowWaterConsumption) { this.flowWaterConsumption = flowWaterConsumption; }

    public Long getCardNum() { return cardNum; }

    public void setCardNum(Long cardNum) { this.cardNum = cardNum; }

    public Long getCardRemain() { return cardRemain; }

    public void setCardRemain(Long cardRemain) { this.cardRemain = cardRemain; }

    public Date getCardRechargeTime() { return cardRechargeTime; }

    public void setCardRechargeTime(Date cardRechargeTime) { this.cardRechargeTime = cardRechargeTime; }
}
