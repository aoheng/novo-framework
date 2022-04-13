package com.novo.scheduled.config;

public enum RestartPattern {
	
	stop_restart,stop_close;
	
	public RestartPattern getRestartPattern(String restartPattern) {
		for(RestartPattern r : RestartPattern.values()) {
			if(r.name().equals(restartPattern)) {
				return r;
			}
		}
		return null;
	}
}
