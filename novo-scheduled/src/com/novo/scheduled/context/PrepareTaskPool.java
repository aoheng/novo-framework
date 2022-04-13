package com.novo.scheduled.context;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class PrepareTaskPool {
	
	private static ConcurrentHashMap<String, TaskMetadata> taskPool = new ConcurrentHashMap<String, TaskMetadata>();
	
	public static final void put(String taskName,TaskMetadata taskMetadata) {
		taskPool.put(taskName, taskMetadata);
	}
	
	public static final TaskMetadata get(String taskName) {
		return taskPool.get(taskName);
	}
	
	public static final Map<String, TaskMetadata> getAll(){
		return taskPool;
	}
	private static boolean prepare = true;
	
	public static final boolean prepareStatus() {
		return prepare;
	}
	
	public static final void setPrepareStatus(boolean prepareStatus) {
		prepare = prepareStatus;
	}
}
