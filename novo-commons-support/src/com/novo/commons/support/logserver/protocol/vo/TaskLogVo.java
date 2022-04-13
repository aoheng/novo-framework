package com.novo.commons.support.logserver.protocol.vo;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.novo.framework.core.bean.FieldBean;
import com.novo.framework.core.log.LogLevel;

public class TaskLogVo implements Serializable{
	
	/** 
	* @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	*/ 
	private static final long serialVersionUID = 1L;
	private Long id;
	private String taskId;//任务Id
	
	private String cloudServiceName;//云服务名称
	
	private String targetServiceName;//服务名称
	
	private String serviceName;
	
	private String requestProtocol;//请求协议json
	
	private String callerId;//调用者(用户ID,客户ID)
	
	private String callerType;//调用者类型(APP,WEB....)
	
	private String responseProtocol;//响应协议json 不包含data部分
	
	private Date startTime;
	
	private Date endTime;
	
	private Long lifeCycle;//生命周期 毫秒

	private String orgCode;
	
	private LogLevel logLevel;
	
	private String invokeMethod;
	
	
	public String getInvokeMethod() {
		return invokeMethod;
	}

	public void setInvokeMethod(String invokeMethod) {
		this.invokeMethod = invokeMethod;
	}

	public LogLevel getLogLevel() {
		return logLevel;
	}

	public void setLogLevel(LogLevel logLevel) {
		this.logLevel = logLevel;
	}

	public String getServiceName() {
		return serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public String getOrgCode() {
		return orgCode;
	}

	public void setOrgCode(String orgCode) {
		this.orgCode = orgCode;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTaskId() {
		return taskId;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
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

	public String getCallerId() {
		return callerId;
	}

	public void setCallerId(String callerId) {
		this.callerId = callerId;
	}

	public String getCallerType() {
		return callerType;
	}

	public void setCallerType(String callerType) {
		this.callerType = callerType;
	}

	public String getResponseProtocol() {
		return responseProtocol;
	}

	public void setResponseProtocol(String responseProtocol) {
		this.responseProtocol = responseProtocol;
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

	public Long getLifeCycle() {
		return lifeCycle;
	}

	public void setLifeCycle(Long lifeCycle) {
		this.lifeCycle = lifeCycle;
	}
	
}
