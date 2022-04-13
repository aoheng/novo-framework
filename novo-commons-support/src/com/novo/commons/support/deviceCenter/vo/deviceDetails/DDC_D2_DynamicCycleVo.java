package com.novo.commons.support.deviceCenter.vo.deviceDetails;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @author Aoheng on 2020/10/30
 * 实时信息（洗碗机）
 */
public class DDC_D2_DynamicCycleVo implements Serializable {

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
     * 工作模式
     */
    @FieldDetail(name = "工作模式", fieldName = "workMode", type = "int")
    private Integer workMode;

    /**
     * 洗涤剩余时间
     */
    @FieldDetail(name = "洗涤剩余时间", fieldName = "washRemainTime", type = "int")
    private Integer washRemainTime;

    /**
     * 实时温度
     */
    @FieldDetail(name = "实时温度", fieldName = "actualTemp", type = "int")
    private Integer actualTemp;

    /**
     * 主洗目标温度
     */
    @FieldDetail(name = "主洗目标温度", fieldName = "washTemp", type = "int")
    private Integer washTemp;

    /**
     * 漂洗目标温度
     */
    @FieldDetail(name = "漂洗目标温度", fieldName = "rinseTemp", type = "int")
    private Integer rinseTemp;

    /**
     * 洗涤阶段
     */
    @FieldDetail(name = "洗涤阶段", fieldName = "washPhase", type = "int")
    private Integer washPhase;

    /**
     * 预洗浊度判定值
     */
    @FieldDetail(name = "预洗浊度判定值", fieldName = "preWashTurbidity", type = "int")
    private Integer preWashTurbidity;

    /**
     * 主洗浊度判定值
     */
    @FieldDetail(name = "主洗浊度判定值", fieldName = "mainWashTurbidity", type = "int")
    private Integer mainWashTurbidity;

    /**
     * 漂洗结束的浑浊度
     */
    @FieldDetail(name = "漂洗结束的浑浊度", fieldName = "endWashTurbidity", type = "int")
    private Integer endWashTurbidity;

    /**
     * 净水芯剩余容量
     */
    @FieldDetail(name = "净水芯剩余容量", fieldName = "coreR1", type = "int")
    private Integer coreR1;
    /**
     * 软水芯剩余容量
     */
    @FieldDetail(name = "软水芯剩余容量", fieldName = "coreR2", type = "int")
    private Integer coreR2;
    /**
     * 净洁芯剩余容量
     */
    @FieldDetail(name = "净洁芯剩余容量", fieldName = "coreR3", type = "int")
    private Integer coreR3;
    /**
     * 亮碟芯剩余容量
     */
    @FieldDetail(name = "亮碟芯剩余容量", fieldName = "coreR4", type = "int")
    private Integer coreR4;
    /**
     * 滤芯详细信息
     */
    private Map<String, Object> ppfDetails;
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

    public Map<String, Object> getPpfDetails() {
        return ppfDetails;
    }

    public void setPpfDetails(Map<String, Object> ppfDetails) {
        this.ppfDetails = ppfDetails;
    }

    public Date getCurrentTime() {
        return currentTime;
    }

    public void setCurrentTime(Date currentTime) {
        this.currentTime = currentTime;
    }

    public Integer getWorkMode() {
        return workMode;
    }

    public void setWorkMode(Integer workMode) {
        this.workMode = workMode;
    }

    public Integer getWashRemainTime() {
        return washRemainTime;
    }

    public void setWashRemainTime(Integer washRemainTime) {
        this.washRemainTime = washRemainTime;
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

    public Integer getCoreR1() {
        if (ppfDetails != null)
            this.coreR1 = (Integer) ppfDetails.get("coreR1");
        return coreR1;
    }

    public void setCoreR1(Integer coreR1) {
        this.coreR1 = coreR1;
    }

    public Integer getCoreR2() {
        if (ppfDetails != null)
            this.coreR2 = (Integer) ppfDetails.get("coreR2");
        return coreR2;
    }

    public void setCoreR2(Integer coreR2) {
        this.coreR2 = coreR2;
    }

    public Integer getCoreR3() {
        if (ppfDetails != null)
            this.coreR3 = (Integer) ppfDetails.get("coreR3");
        return coreR3;
    }

    public void setCoreR3(Integer coreR3) {
        this.coreR3 = coreR3;
    }

    public Integer getCoreR4() {
        if (ppfDetails != null)
            this.coreR4 = (Integer) ppfDetails.get("coreR4");
        return coreR4;
    }

    public void setCoreR4(Integer coreR4) {
        this.coreR4 = coreR4;
    }
}
