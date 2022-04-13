package com.novo.data.redis.bean;

/**
 * @author aoheng
 * @Date 2021/02/01
 */
public class RedisSession {

    private SessionDataType dataType;

    private String sessionId;

    public RedisSession(SessionDataType dataType, String sessionId) {
        this.dataType = dataType;
        this.sessionId = sessionId;
    }

    public RedisSession() {

    }

    public SessionDataType getDataType() {
        return dataType;
    }

    public void setDataType(SessionDataType dataType) {
        this.dataType = dataType;
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }
}
