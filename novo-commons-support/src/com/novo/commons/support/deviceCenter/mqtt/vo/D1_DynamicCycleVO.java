package com.novo.commons.support.deviceCenter.mqtt.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.novo.commons.support.deviceCenter.mqtt.bean.ByteGprs;
import com.novo.commons.support.deviceCenter.mqtt.bean.D1_ByteArrayErrorCode;
import com.novo.commons.support.deviceCenter.mqtt.bean.D1_ByteArraySwitchFlag;

import java.util.Date;

/**
 * @author Aoheng on 2020/10/30
 * 实时信息（净水器）
 */
public class D1_DynamicCycleVO {

    /** 当前时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8:00")
    private Date currentTime;
    /** 滤芯A剩余百分比 */
    private Integer coreR1Percent;
    /** 滤芯A剩余百分比 */
    private Integer coreR2Percent;
    /** 滤芯A剩余百分比 */
    private Integer coreR3Percent;
    /** 开关位 */
    private D1_ByteArraySwitchFlag switchFlag;
    /** TD1 */
    private Integer td1;
    /** TD2 */
    private Integer td2;
    /** 节水比率 */
    private Integer waterSavingRate;
    /** 错误数量 */
    private Integer errorCount;
    /** 错误代码 */
    private D1_ByteArrayErrorCode errorCode;
    /** 总断网时长 */
    private Long disconnectInterval;
    /** 制水次数 */
    private Integer produceWaterTimes;
    /** 累计用水量 */
    private Long totalWaterConsumption;
    /** GPRS信号强度(CSQ) */
    private ByteGprs gprs;
    /** 当前温度 */
    private Integer currentTemp;
    /** 加热温度 */
    private Integer heatingTemp;
    /**
     * 温度模式
     * M1（0-冲奶模式 1-温水模式 2-绿茶模式 3-咖啡模式（暂无用） 4-红茶模式 5-开水模式（暂无用） 6-自定义模式）
     * MiniM4（0-高温模式（86~99℃） 1-中温模式（75~85℃） 2-低温模式45℃ 3-自定义模式（45~95℃））
     * 厨上YCZ-CT6-S1(HWP)（0-固定40℃ 1-固定85℃ 2-固定99℃ 3-用户设置）
     */
    private Integer tempMode;
    /**
     * 水量模式
     * MiniM4（0-连续 1-200ML 2-330ML 4-500ML）
     */
    private Integer waterMode;

    public Integer getWaterMode() { return waterMode; }

    public void setWaterMode(Integer waterMode) { this.waterMode = waterMode; }

    public Integer getTempMode() { return tempMode; }

    public void setTempMode(Integer tempMode) { this.tempMode = tempMode; }

    public Integer getHeatingTemp() { return heatingTemp; }

    public void setHeatingTemp(Integer heatingTemp) { this.heatingTemp = heatingTemp; }

    public Integer getCurrentTemp() { return currentTemp; }

    public void setCurrentTemp(Integer currentTemp) { this.currentTemp = currentTemp; }

    public Date getCurrentTime() { return currentTime; }

    public void setCurrentTime(Date currentTime) { this.currentTime = currentTime; }

    public Integer getCoreR1Percent() { return coreR1Percent; }

    public void setCoreR1Percent(Integer coreR1Percent) { this.coreR1Percent = coreR1Percent; }

    public Integer getCoreR2Percent() { return coreR2Percent; }

    public void setCoreR2Percent(Integer coreR2Percent) { this.coreR2Percent = coreR2Percent; }

    public Integer getCoreR3Percent() { return coreR3Percent; }

    public void setCoreR3Percent(Integer coreR3Percent) { this.coreR3Percent = coreR3Percent; }

    public D1_ByteArraySwitchFlag getSwitchFlag() { return switchFlag; }

    public void setSwitchFlag(D1_ByteArraySwitchFlag switchFlag) { this.switchFlag = switchFlag; }

    public Integer getTd1() { return td1; }

    public void setTd1(Integer td1) { this.td1 = td1; }

    public Integer getTd2() { return td2; }

    public void setTd2(Integer td2) { this.td2 = td2; }

    public Integer getWaterSavingRate() { return waterSavingRate; }

    public void setWaterSavingRate(Integer waterSavingRate) { this.waterSavingRate = waterSavingRate; }

    public Integer getErrorCount() { return errorCount; }

    public void setErrorCount(Integer errorCount) { this.errorCount = errorCount; }

    public D1_ByteArrayErrorCode getErrorCode() { return errorCode; }

    public void setErrorCode(D1_ByteArrayErrorCode errorCode) { this.errorCode = errorCode; }

    public Long getDisconnectInterval() { return disconnectInterval; }

    public void setDisconnectInterval(Long disconnectInterval) { this.disconnectInterval = disconnectInterval; }

    public Integer getProduceWaterTimes() { return produceWaterTimes; }

    public void setProduceWaterTimes(Integer produceWaterTimes) { this.produceWaterTimes = produceWaterTimes; }

    public Long getTotalWaterConsumption() { return totalWaterConsumption; }

    public void setTotalWaterConsumption(Long totalWaterConsumption) { this.totalWaterConsumption = totalWaterConsumption; }

    public ByteGprs getGprs() { return gprs; }

    public void setGprs(ByteGprs gprs) { this.gprs = gprs; }
}
