package com.novo.commons.support.deviceCenter.vo.deviceDetails;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @author Aoheng on 2020/10/30
 * 实时信息（碧丽三出水）
 */
public class DDC_D1_b_DynamicCycleVo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 当前时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8:00")
    @FieldDetail(name = "上报时间", fieldName = "currentTime", type = "date")
    private Date currentTime;

    /**
     * 开关位
     */
    @FieldDetail(name = "开关位", fieldName = "events")
    private List<String> events;

    /**
     * 错误代码
     */
    @FieldDetail(name = "错误代码", fieldName = "errors")
    private List<String> errors;

    /**
     * 信号强度（0-5）
     */
    @FieldDetail(name = "信号强度（0-5）", fieldName = "signal", type = "int")
    private Integer signal;

    /**
     * 总断网时长
     */
    @FieldDetail(name = "总断网时长", fieldName = "disconnectInterval", type = "long")
    private Long disconnectInterval;

    /**
     * 当前温度
     */
    @FieldDetail(name = "当前温度", fieldName = "currentTemp", type = "int")
    private Integer currentTemp;

    /**
     * 出水口
     */
    @FieldDetail(name = "出水口", fieldName = "outlet", type = "int")
    private Integer outlet;

    /**
     * 出水量（单位/毫升）
     */
    @FieldDetail(name = "出水量（单位/毫升）", fieldName = "flowWaterConsumption", type = "long")
    private Long flowWaterConsumption;

    /**
     * 用户卡号
     */
    @FieldDetail(name = "用户卡号", fieldName = "cardNum", type = "long")
    private Long cardNum;

    /**
     * 用户卡剩余水量（单位/毫升）
     */
    @FieldDetail(name = "用户卡剩余水量（单位/毫升）", fieldName = "cardRemain", type = "int")
    private Long cardRemain;

    /**
     * 用户卡充值时间
     */
    @FieldDetail(name = "用户卡充值时间", fieldName = "cardRechargeTime", type = "date")
    private Date cardRechargeTime;
    /**
     * 开关位
     */
    @JsonIgnore
    private Map<String, Object> switchFlag;
    /**
     * 错误代码
     */
    @JsonIgnore
    private Map<String, Object> errorCode;
    /**
     * GPRS信号强度(CSQ)
     */
    @JsonIgnore
    private Map<String, Object> gprs;

    public Date getCurrentTime() {
        return currentTime;
    }

    public void setCurrentTime(Date currentTime) {
        this.currentTime = currentTime;
    }

    public Long getDisconnectInterval() {
        return disconnectInterval;
    }

    public void setDisconnectInterval(Long disconnectInterval) {
        this.disconnectInterval = disconnectInterval;
    }

    public Integer getCurrentTemp() {
        return currentTemp;
    }

    public void setCurrentTemp(Integer currentTemp) {
        this.currentTemp = currentTemp;
    }

    public Integer getOutlet() {
        return outlet;
    }

    public void setOutlet(Integer outlet) {
        this.outlet = outlet;
    }

    public Long getFlowWaterConsumption() {
        return flowWaterConsumption;
    }

    public void setFlowWaterConsumption(Long flowWaterConsumption) {
        this.flowWaterConsumption = flowWaterConsumption;
    }

    public Long getCardNum() {
        return cardNum;
    }

    public void setCardNum(Long cardNum) {
        this.cardNum = cardNum;
    }

    public Long getCardRemain() {
        return cardRemain;
    }

    public void setCardRemain(Long cardRemain) {
        this.cardRemain = cardRemain;
    }

    public Date getCardRechargeTime() {
        return cardRechargeTime;
    }

    public void setCardRechargeTime(Date cardRechargeTime) {
        this.cardRechargeTime = cardRechargeTime;
    }

    ////
    public List<String> getEvents() {
        if (switchFlag != null)
            this.events = (List<String>) switchFlag.get("events");
        return events;
    }

    public void setEvents(List<String> events) {
        this.events = events;
    }

    public List<String> getErrors() {
        if (errorCode != null)
            this.errors = (List<String>) errorCode.get("errors");
        return errors;
    }

    public void setErrors(List<String> errors) {
        this.errors = errors;
    }

    public Integer getSignal() {
        if (gprs != null)
            this.signal = (Integer) gprs.get("signal");
        return signal;
    }

    public void setSignal(Integer signal) {
        this.signal = signal;
    }

    public Map<String, Object> getSwitchFlag() {
        return switchFlag;
    }

    public void setSwitchFlag(Map<String, Object> switchFlag) {
        this.switchFlag = switchFlag;
    }

    public Map<String, Object> getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(Map<String, Object> errorCode) {
        this.errorCode = errorCode;
    }

    public Map<String, Object> getGprs() {
        return gprs;
    }

    public void setGprs(Map<String, Object> gprs) {
        this.gprs = gprs;
    }
}
