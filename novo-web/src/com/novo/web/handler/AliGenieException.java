package com.novo.web.handler;

import com.novo.framework.core.protocol.Message;

public class AliGenieException extends RuntimeException implements Message{
	/** 
	* @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	*/ 
	private static final long serialVersionUID = 1L;
	private String errorCode, message;
	private Boolean status;
	
	public AliGenieException(String errorCode,String message) {
		this.errorCode = errorCode;
		this.message = message;
	}
	
	@Override
	public String getCode() {
		return errorCode;
	}

	@Override
	public Boolean getStatus() {
		return status;
	}

	@Override
	public String getMessage() {
		return this.message;
	}
	
	@Override
	public String toString() {
		return "{\"error\":\""+errorCode+"\","+
				"\"error_dercription\":\""+message+"\"}";
	}
}
