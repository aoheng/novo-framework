package com.novo.scheduled;

import com.novo.framework.core.monitor.Notify;
import com.novo.scheduled.config.ConfigureBean;
import com.novo.scheduled.context.TaskMetadata;
import com.novo.scheduled.monitor.Watch;
import com.novo.scheduled.thread.TaskThread;

import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.ConcurrentHashMap;

public class ScheduledTask implements Notify,Watch{
	
	private static ConcurrentHashMap<String, TaskMetadata> taskPool = new ConcurrentHashMap<String, TaskMetadata>();
	private static ScheduledTaskThread scheduledTask;
	private static ConcurrentHashMap<String, TaskThread> threadPool = new ConcurrentHashMap<String,TaskThread>();
	public void scheduled() {
		scheduledTask = new ScheduledTaskThread();
		scheduledTask.start();
	}
	public void registrarTask(TaskMetadata metadata) {
		String taskName = metadata.getConfigureBean().getTaskName();
		taskPool.put(taskName, metadata);
		threadPool.put(taskName, new TaskThread(taskName,metadata.getTask()));
	}
	
	public TaskMetadata getTask(String taskName) {
		return taskPool.get(taskName);
	}
	
	public void removeTask(String taskName) {
		if(taskPool.get(taskName) != null) {
			taskPool.remove(taskName);
		}
		if(threadPool.get(taskName) != null) {
			threadPool.remove(taskName);
		}
	}
	
	private void startScheduledTaskThread() {
		scheduledTask = new ScheduledTaskThread();
		scheduledTask.start();
	}
	class ScheduledTaskThread extends Thread{
		private boolean timingExecution(ConfigureBean configure) {
			String executeTime = configure.getExecuteTime();
			int hour = Integer.valueOf(executeTime.split(":")[0]);
			int minute = Integer.valueOf(executeTime.split(":")[1]);
			int second = Integer.valueOf(executeTime.split(":")[2]);
			Calendar cal = Calendar.getInstance();
			int currentHour = cal.get(Calendar.HOUR_OF_DAY);//小时
	        int currentMinute = cal.get(Calendar.MINUTE);//分           
	        int currentSecond = cal.get(Calendar.SECOND);//秒
	        if(second != 0) {
	        	if(second == currentSecond) {
	        		return true;
	        	}
	        	return false;
	        }else {
	        	if(minute != 0) {
	        		if(minute == currentMinute) {
	        			return true;
	        		}
	        		return false;
	        	}else {
	        		if(hour != 0) {
	        			if(hour == currentHour) {
	        				return true;
	        			}
	        			return false;
	        		}
	        	}
	        	
	        }
	        return false;
		}
		
		private boolean intervalExecution(ConfigureBean configure) {
			long interval = configure.getInterval();
			Long beforeTime = configure.getBeforeTime();
			Date currentTime = new Date();
			if(currentTime.getTime() - beforeTime >= interval) {
				configure.setBeforeTime(currentTime.getTime());
				return true;
			}
			return false;
		}
		private boolean timingIntervalExecution(ConfigureBean configure) {
			boolean timing = this.timingExecution(configure);
			if(timing) {
				return this.intervalExecution(configure);
			}
			
			return false;
		}
		private boolean isStart(ConfigureBean configure) {
			switch (configure.getStartPattern()) {
				case timing_execution:
					return this.timingExecution(configure);
				case interval_execution: 
					return this.intervalExecution(configure);
				
				case timing_interval_execution : 
					return this.timingIntervalExecution(configure);
				default:
					 return false;
			}
		}
		
		public void run() {
			for(TaskMetadata metadata : taskPool.values()) {
				TaskThread task = threadPool.get(metadata.getConfigureBean().getTaskName());
				if(task == null || !task.isAlive() || task.getState() == State.TERMINATED) {
					ConfigureBean configure = metadata.getConfigureBean();
					if(isStart(configure)) {
						task = new TaskThread(configure.getTaskName(),metadata.getTask());
						task.start();
						threadPool.put(configure.getTaskName(), task);
					}
				}
			}
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	@Override
	public boolean watchStatus() {
		return scheduledTask.isAlive();
	}
	
	@Override
	public void executeEvent() {
		this.startScheduledTaskThread();
	}
}
