package com.novo.commons.support.logserver.protocol.vo;

import java.io.Serializable;
import java.util.Date;

import com.novo.framework.core.log.LogLevel;

public class TransactionLogVo implements Serializable{
	/** 
	*/ 
	private static final long serialVersionUID = 1L;
	
	private Long id;
	
	private String cloudServiceName;
	
	private String targetServiceName;
	
	private String requestProtocol;
	
	private LogLevel logLevel;
	
	private Boolean isSuccess;
	
	private String message;

	private Date startTime;
	
	private Date endTime;
	//invoking,invoked_success,invoked_fail,not_invoke;
	private String invokeStatus;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCloudServiceName() {
		return cloudServiceName;
	}
	public void setCloudServiceName(String cloudServiceName) {
		this.cloudServiceName = cloudServiceName;
	}
	public String getTargetServiceName() {
		return targetServiceName;
	}
	public void setTargetServiceName(String targetServiceName) {
		this.targetServiceName = targetServiceName;
	}
	public String getRequestProtocol() {
		return requestProtocol;
	}
	public void setRequestProtocol(String requestProtocol) {
		this.requestProtocol = requestProtocol;
	}
	public LogLevel getLogLevel() {
		return logLevel;
	}
	public void setLogLevel(LogLevel logLevel) {
		this.logLevel = logLevel;
	}
	public Boolean getIsSuccess() {
		return isSuccess;
	}
	public void setIsSuccess(Boolean isSuccess) {
		this.isSuccess = isSuccess;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Date getStartTime() {
		return startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}
	public Date getEndTime() {
		return endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
	public String getInvokeStatus() {
		return invokeStatus;
	}
	public void setInvokeStatus(String invokeStatus) {
		this.invokeStatus = invokeStatus;
	}
	
}
