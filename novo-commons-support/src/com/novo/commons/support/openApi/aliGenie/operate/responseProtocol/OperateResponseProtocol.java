package com.novo.commons.support.openApi.aliGenie.operate.responseProtocol;

/**
 * @author MickeyChen
 * @date 2020/12/17
 */
public class OperateResponseProtocol {

    private String returnCode;

    private String returnErrorSolution;

    private String returnMessage;

    private OperateReturnValueVO returnValue;

    public String getReturnCode() {
        return returnCode;
    }

    public void setReturnCode(String returnCode) {
        this.returnCode = returnCode;
    }

    public String getReturnErrorSolution() {
        return returnErrorSolution;
    }

    public void setReturnErrorSolution(String returnErrorSolution) {
        this.returnErrorSolution = returnErrorSolution;
    }

    public String getReturnMessage() {
        return returnMessage;
    }

    public void setReturnMessage(String returnMessage) {
        this.returnMessage = returnMessage;
    }

    public OperateReturnValueVO getReturnValue() {
        return returnValue;
    }

    public void setReturnValue(OperateReturnValueVO returnValue) {
        this.returnValue = returnValue;
    }
}
