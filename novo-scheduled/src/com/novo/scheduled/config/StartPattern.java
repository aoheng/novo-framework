package com.novo.scheduled.config;

public enum StartPattern {
	timing_execution,interval_execution,timing_interval_execution;
	
	public StartPattern getStartPattern(String startPattern) {
		for(StartPattern r : StartPattern.values()) {
			if(r.name().equals(startPattern)) {
				return r;
			}
		}
		return null;
	}
}
