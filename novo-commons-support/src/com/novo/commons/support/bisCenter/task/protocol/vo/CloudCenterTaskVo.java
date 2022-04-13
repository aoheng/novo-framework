package com.novo.commons.support.bisCenter.task.protocol.vo;

import java.io.Serializable;

public class CloudCenterTaskVo implements Serializable{
	/** 
	* @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	*/ 
	private static final long serialVersionUID = 1L;

	private Long id;
	
	/** 
	* @Fields cloudCenterName :云中心名称
	*/ 
	private String cloudCenterName;
	
	/** 
	* @Fields cloudServiceName :云服务名称（微服务）
	*/ 
	private String cloudServiceName;
	
	/** 
	* @Fields taskName :任务名称
	*/
	private String taskName;
	/** 
	* @Fields delay :执行时间间隔
	*/
	public Long interval = 1000l;
	
	/** 
	* @Fields delay :延迟执行时间
	*/ 
	public Long delay = 0l;
	
	/** 
	* @Fields restartPattern : 任务执行失败后，重启策略
	*/
	public String restartPattern ;
	
	/** 
	* @Fields startPattern : 任务启动策略
	*/
	public String startPattern;
	
	/** 
	* @Fields executeTime : 执行时间
	*/
	public String executeTime;
	
	public Boolean closed;

	private String params;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getParams() {
		return params;
	}

	public void setParams(String params) {
		this.params = params;
	}

	public String getCloudCenterName() {
		return cloudCenterName;
	}

	public void setCloudCenterName(String cloudCenterName) {
		this.cloudCenterName = cloudCenterName;
	}

	public String getCloudServiceName() {
		return cloudServiceName;
	}

	public void setCloudServiceName(String cloudServiceName) {
		this.cloudServiceName = cloudServiceName;
	}

	public String getTaskName() {
		return taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	public Long getInterval() {
		return interval;
	}

	public void setInterval(Long interval) {
		this.interval = interval;
	}

	public Long getDelay() {
		return delay;
	}

	public void setDelay(Long delay) {
		this.delay = delay;
	}

	public String getRestartPattern() {
		return restartPattern;
	}

	public void setRestartPattern(String restartPattern) {
		this.restartPattern = restartPattern;
	}

	public String getStartPattern() {
		return startPattern;
	}

	public void setStartPattern(String startPattern) {
		this.startPattern = startPattern;
	}

	public String getExecuteTime() {
		return executeTime;
	}

	public void setExecuteTime(String executeTime) {
		this.executeTime = executeTime;
	}

	public Boolean getClosed() {
		return closed;
	}

	public void setClosed(Boolean closed) {
		this.closed = closed;
	}
}
