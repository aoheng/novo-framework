package com.novo.commons.support.openApi.aliGenie.operate.responseProtocol;

/**
 * @author MickeyChen
 * @date 2020/12/17
 */
public class AskedInfoMsgVO {

    private String parameterName;
    private String intentId;

    public String getParameterName() {
        return parameterName;
    }

    public void setParameterName(String parameterName) {
        this.parameterName = parameterName;
    }

    public String getIntentId() {
        return intentId;
    }

    public void setIntentId(String intentId) {
        this.intentId = intentId;
    }
}
