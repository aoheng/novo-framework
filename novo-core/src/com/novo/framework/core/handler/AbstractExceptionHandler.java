package com.novo.framework.core.handler;

import com.novo.framework.core.exception.CustomException;
import com.novo.framework.core.exception.NullFieldException;
import com.novo.framework.core.exception.SystemException;
import com.novo.framework.core.protocol.BaseResponseProtocol;
import com.novo.framework.core.protocol.Message;

public abstract class AbstractExceptionHandler {

    @SuppressWarnings("rawtypes")
    protected abstract BaseResponseProtocol customExceptionHandler(CustomException e);

    @SuppressWarnings("rawtypes")
    protected abstract BaseResponseProtocol nullFieldExceptionHandler(NullFieldException e);

    @SuppressWarnings("rawtypes")
    protected abstract BaseResponseProtocol systemExceptionHandler(SystemException e);

    @SuppressWarnings("rawtypes")
    protected BaseResponseProtocol getResponseProtocol(Message message) {
        BaseResponseProtocol response = new BaseResponseProtocol();
        response.writeMessage(message);
        return response;
    }
}
