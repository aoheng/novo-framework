package com.novo.commons.support.openApi.aliGenie.operate;

import java.util.List;
import java.util.Map;

/**
 * @author MickeyChen
 * @date 2020/12/14
 */
public class AliGenieOperateVO {

    private String sessionId;
    private String utterance;
    private Integer skillId;
    private String skillName;
    private String intentId;
    private String intentName;
    private Map<String, String> requestData;
    private List<SlotEntitiesVO> slotEntities;
    private Integer botId;
    private Integer domainId;
    private String requestId;

    private String token;

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public String getUtterance() {
        return utterance;
    }

    public void setUtterance(String utterance) {
        this.utterance = utterance;
    }

    public Integer getSkillId() {
        return skillId;
    }

    public void setSkillId(Integer skillId) {
        this.skillId = skillId;
    }

    public String getSkillName() {
        return skillName;
    }

    public void setSkillName(String skillName) {
        this.skillName = skillName;
    }

    public String getIntentId() {
        return intentId;
    }

    public void setIntentId(String intentId) {
        this.intentId = intentId;
    }

    public String getIntentName() {
        return intentName;
    }

    public Map<String, String> getRequestData() {
        return requestData;
    }

    public void setRequestData(Map<String, String> requestData) {
        this.requestData = requestData;
    }

    public void setIntentName(String intentName) {
        this.intentName = intentName;
    }

    public List<SlotEntitiesVO> getSlotEntities() {
        return slotEntities;
    }

    public void setSlotEntities(List<SlotEntitiesVO> slotEntities) {
        this.slotEntities = slotEntities;
    }

    public Integer getBotId() {
        return botId;
    }

    public void setBotId(Integer botId) {
        this.botId = botId;
    }

    public Integer getDomainId() {
        return domainId;
    }

    public void setDomainId(Integer domainId) {
        this.domainId = domainId;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
