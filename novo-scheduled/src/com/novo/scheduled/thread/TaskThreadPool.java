package com.novo.scheduled.thread;

import java.util.concurrent.ConcurrentHashMap;

public class TaskThreadPool {
	
	private static ConcurrentHashMap<String, TaskThread> threadPool = new ConcurrentHashMap<String,TaskThread>();
	
	public static void addThread(String threadName,TaskThread thread) {
		threadPool.put(threadName, thread);
	}
	
	public static TaskThread getThread(String threadName) {
		return threadPool.get(threadName);
	}
}
