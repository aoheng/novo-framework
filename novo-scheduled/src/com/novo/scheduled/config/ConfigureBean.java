package com.novo.scheduled.config;

public class ConfigureBean {
	private String taskName;
	
	private Long interval;
	
	private Long delay;
	
	private RestartPattern restartPattern;
	
	private StartPattern startPattern;
	
	private String executeTime;
	
	private Long beforeTime = 0l;
	
	
	
	public Long getBeforeTime() {
		return beforeTime;
	}

	public void setBeforeTime(Long beforeTime) {
		this.beforeTime = beforeTime;
	}

	public String getTaskName() {
		return taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	public String getExecuteTime() {
		return executeTime;
	}

	public void setExecuteTime(String executeTime) {
		this.executeTime = executeTime;
	}

	public StartPattern getStartPattern() {
		return startPattern;
	}

	public void setStartPattern(StartPattern startPattern) {
		this.startPattern = startPattern;
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

	public RestartPattern getRestartPattern() {
		return restartPattern;
	}

	public void setRestartPattern(RestartPattern restartPattern) {
		this.restartPattern = restartPattern;
	}
	
	
}
