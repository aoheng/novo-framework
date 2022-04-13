package com.novo.web.handler;

import com.novo.framework.core.handler.AbstractExceptionHandler;
import com.novo.framework.core.protocol.BaseResponseProtocol;
import org.springframework.validation.BindException;

import java.util.concurrent.RejectedExecutionException;

public abstract class SpringExceptionHandler extends AbstractExceptionHandler{
	
	protected abstract BaseResponseProtocol rejectedExecutionExceptionHandler(RejectedExecutionException e);
	
	protected abstract BaseResponseProtocol bindExceptionHandler(BindException e) ;
}
