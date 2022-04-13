package com.novo.commons.support.openApi.aliGenie.operate.responseProtocol;

import java.util.List;
import java.util.Map;

/**
 * @author MickeyChen
 * @date 2020/12/17
 */
public class OperateReturnValueVO {

    private String reply;

    private String resultType;

    private Map<String, String> properties;

    private List<AskedInfoMsgVO> askedInfos;

    private List<ActionVO> actions;

    private String executeCode;

    public String getReply() {
        return reply;
    }

    public void setReply(String reply) {
        this.reply = reply;
    }

    public String getResultType() {
        return resultType;
    }

    public void setResultType(String resultType) {
        this.resultType = resultType;
    }

    public Map<String, String> getProperties() {
        return properties;
    }

    public void setProperties(Map<String, String> properties) {
        this.properties = properties;
    }

    public List<AskedInfoMsgVO> getAskedInfos() {
        return askedInfos;
    }

    public void setAskedInfos(List<AskedInfoMsgVO> askedInfos) {
        this.askedInfos = askedInfos;
    }

    public List<ActionVO> getActions() {
        return actions;
    }

    public void setActions(List<ActionVO> actions) {
        this.actions = actions;
    }

    public String getExecuteCode() {
        return executeCode;
    }

    public void setExecuteCode(String executeCode) {
        this.executeCode = executeCode;
    }
}
