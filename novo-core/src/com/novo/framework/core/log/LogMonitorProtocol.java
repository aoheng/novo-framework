package com.novo.framework.core.log;

import com.novo.framework.core.protocol.RequestProtocol;

public class LogMonitorProtocol extends RequestProtocol {

    private static final long serialVersionUID = 1L;

    private String callerId;

    private String callerType;

    public String getCallerId() {
        return callerId;
    }

    public void setCallerId(String callerId) {
        this.callerId = callerId;
    }

    public String getCallerType() {
        return callerType;
    }

    public void setCallerType(String callerType) {
        this.callerType = callerType;
    }


}
