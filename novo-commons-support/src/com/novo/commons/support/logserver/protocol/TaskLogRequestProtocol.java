package com.novo.commons.support.logserver.protocol;

import com.novo.framework.core.log.LogLevel;
import com.novo.framework.core.protocol.PaginationRequestProtocol;
import com.novo.framework.core.protocol.TimeStamp;

import java.util.Date;

public class TaskLogRequestProtocol extends PaginationRequestProtocol implements TimeStamp{

	private static final long serialVersionUID = 1L;
	
	private String targetTimeName;
	
	private String cloudServiceName;//�Ʒ�������
	
	private String targetServiceName;//��������
	
	private String requestProtocol;//����Э��json
	
	private String callerId;//������(�û�ID,�ͻ�ID)
	
	private String callerType;//����������(APP,WEB....)
	
	private String responseProtocol;//��ӦЭ��json ������data����
	
	private Date startTime;

	private Long creatorId;
	
	private Date endTime;
	
	private Long lifeCycle;//�������� ����

	private LogLevel logLevel;
	
	private String invokeMethod;


	@Override
	public Long getCreatorId() {
		return creatorId;
	}

	@Override
	public void setCreatorId(Long creatorId) {
		this.creatorId = creatorId;
	}

	public String getTargetTimeName() {
		return targetTimeName;
	}

	public void setTargetTimeName(String targetTimeName) {
		this.targetTimeName = targetTimeName;
	}

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

	@Override
	public String targetTimeName() {
		return targetTimeName;
	}
	
	
}
