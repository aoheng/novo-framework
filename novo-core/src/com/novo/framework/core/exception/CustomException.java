package com.novo.framework.core.exception;

import com.novo.framework.core.protocol.Message;

public class CustomException extends RuntimeException implements Message {

    /**
     * @Fields serialVersionUID : TODO(��һ�仰�������������ʾʲô)
     */
    private static final long serialVersionUID = 1L;

    private String errorCode, message;
    private Boolean status;

    public CustomException(String errorCode, String message) {
        this.errorCode = errorCode;
        this.message = message;
        this.status = false;
    }

    public CustomException(Message message) {
        this.errorCode = message.getCode();
        this.message = message.getMessage();
        this.status = message.getStatus();
    }

    @Override
    public String getCode() {
        return this.errorCode;
    }

    @Override
    public Boolean getStatus() {
        return status;
    }

    @Override
    public String getMessage() {
        return this.message;
    }

}
