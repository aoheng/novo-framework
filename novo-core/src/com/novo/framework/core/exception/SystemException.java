package com.novo.framework.core.exception;

import com.novo.framework.core.protocol.Message;
import com.novo.framework.core.protocol.ResponseMessage;

public class SystemException extends RuntimeException implements Message {

    /**
     */
    private static final long serialVersionUID = 1L;

    private String errorCode, message;
    private Boolean status;

    public SystemException() {
        this.errorCode = ResponseMessage.CODE_SYSTEM_ERROR.getCode();
        this.message = ResponseMessage.CODE_SYSTEM_ERROR.getMessage();
        this.status = ResponseMessage.CODE_SYSTEM_ERROR.getStatus();
    }

    public SystemException(String message){
        this.errorCode = ResponseMessage.CODE_SYSTEM_ERROR.getCode();
        this.message = message;
        this.status = ResponseMessage.CODE_SYSTEM_ERROR.getStatus();
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
