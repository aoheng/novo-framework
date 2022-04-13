package com.novo.scheduled.context;

import com.novo.framework.core.exception.CustomException;
import com.novo.scheduled.ScheduledTask;
import com.novo.scheduled.Task;
import com.novo.scheduled.monitor.SimpleObserver;
import com.novo.scheduled.monitor.WatchRegistrar;
import com.novo.scheduled.monitor.WatchThread;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class ScheduledContext implements ApplicationContextAware,TaskApplicationContext{
	@Autowired
	private ApplicationContext applicationContext;
	
	private ScheduledTask scheduledTask;
	
	private WatchRegistrar watchRegistrar;

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		if(this.applicationContext == null) {
			 this.applicationContext = applicationContext;
	    }
		this.initContext();
		
	}
	
	public void initContext() {
		if(!PrepareTaskPool.prepareStatus()) {
			throw new CustomException("scheduled task start fail","task configure error");
		}
		this.scheduledTask = new ScheduledTask();
		for(TaskMetadata metadata : PrepareTaskPool.getAll().values()) {
			Task task = (Task)applicationContext.getBean(metadata.getConfigureBean().getTaskName());
			metadata.setTask(task);
			this.scheduledTask.registrarTask(metadata);
		}
		
		this.scheduledTask.scheduled();
		
		this.watchRegistrar = new WatchRegistrar(this.scheduledTask);
		
		watchRegistrar.registerObserver(new SimpleObserver());
		
		WatchThread watchThread = new WatchThread(watchRegistrar);
		
		watchThread.start();
	}
}
