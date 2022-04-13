package com.novo.scheduled.context;

import com.novo.scheduled.ScheduledTask;
import com.novo.scheduled.monitor.SimpleObserver;
import com.novo.scheduled.monitor.WatchRegistrar;
import com.novo.scheduled.monitor.WatchThread;

public class ManualTaskScheduledContext implements TaskApplicationContext{
	
	private ScheduledTask scheduledTask;
	
	private WatchRegistrar watchRegistrar;
	
	private WatchThread watchThread;
	
	public ManualTaskScheduledContext() {
		this.initContext();
	}
	
	public void registrarTask(TaskMetadata metadata) {
		this.scheduledTask.registrarTask(metadata);
	}
	
	public TaskMetadata getTask(String taskName) {
		return this.scheduledTask.getTask(taskName);
	}
	public void removeTask(String taskName) {
		this.scheduledTask.removeTask(taskName);
	}
	
	public void startTaskScheduled() {
		this.scheduledTask.scheduled();
		this.watchThread.start();
	}
	@Override
	public void initContext() {
		this.scheduledTask = new ScheduledTask();
		
		this.watchRegistrar = new WatchRegistrar(this.scheduledTask);
		
		watchRegistrar.registerObserver(new SimpleObserver());
		
		this.watchThread = new WatchThread(watchRegistrar);
	}

}
