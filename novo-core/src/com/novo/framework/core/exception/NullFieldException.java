package com.novo.framework.core.exception;

import com.novo.framework.core.protocol.Message;

public class NullFieldException extends RuntimeException implements Message {

    /**
     */
    private static final long serialVersionUID = 1L;
    private static final String field = "{field}";
    private String errorCode, message;
    private Boolean status;

    public NullFieldException(String fieldName, Message message) {
        this.errorCode = message.getCode();
        this.message = message.getMessage().replace(field, fieldName);
        this.status = message.getStatus();
    }

    @Override
    public String getMessage() {
        return this.message;
    }

    @Override
    public String getCode() {
        return this.errorCode;
    }

    @Override
    public Boolean getStatus() {
        return this.status;
    }
}
