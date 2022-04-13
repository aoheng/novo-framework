package com.novo.commons.support.openApi.aliGenie.operate;

/**
 * @author MickeyChen
 * @date 2020/12/14
 */
public class SlotEntitiesVO {

    private String intentParameterId;
    private String intentParameterName;
    private String originalValue;
    private String standardValue;
    private Integer liveTime;
    private String createTimeStamp;
    private String slotValue;

    public String getIntentParameterId() {
        return intentParameterId;
    }

    public void setIntentParameterId(String intentParameterId) {
        this.intentParameterId = intentParameterId;
    }

    public String getIntentParameterName() {
        return intentParameterName;
    }

    public void setIntentParameterName(String intentParameterName) {
        this.intentParameterName = intentParameterName;
    }

    public String getOriginalValue() {
        return originalValue;
    }

    public void setOriginalValue(String originalValue) {
        this.originalValue = originalValue;
    }

    public String getStandardValue() {
        return standardValue;
    }

    public void setStandardValue(String standardValue) {
        this.standardValue = standardValue;
    }

    public Integer getLiveTime() {
        return liveTime;
    }

    public void setLiveTime(Integer liveTime) {
        this.liveTime = liveTime;
    }

    public String getCreateTimeStamp() {
        return createTimeStamp;
    }

    public void setCreateTimeStamp(String createTimeStamp) {
        this.createTimeStamp = createTimeStamp;
    }

    public String getSlotValue() {
        return slotValue;
    }

    public void setSlotValue(String slotValue) {
        this.slotValue = slotValue;
    }
}
