package com.novo.scheduled.context;

import com.novo.framework.core.exception.CustomException;
import com.novo.framework.core.exception.SystemException;
import com.novo.scheduled.Task;
import com.novo.scheduled.annotation.TaskConfigure;
import com.novo.scheduled.config.ConfigureBean;
import com.novo.scheduled.config.RestartPattern;
import com.novo.scheduled.config.StartPattern;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.util.MultiValueMap;

import java.text.SimpleDateFormat;

public class TaskMetadata {
	
	private Task task;
	
	private Class<Task> taskClass;
	
	private ConfigureBean configureBean;
	
	public TaskMetadata() {}
	
	public TaskMetadata(MetadataReader metadataReader) throws Exception {
		this.writeMetadata(metadataReader);
	}
	
	private void writeMetadata(MetadataReader metadataReader) throws Exception {
		String className = metadataReader.getClassMetadata().getClassName();
		Class<?> clazz = Class.forName(className);
		Class<?> interfaces[] = clazz.getInterfaces();
		if(interfaces != null && interfaces.length > 0) {
			boolean isTargetTask = false;
			for(Class<?> interfaceClass : interfaces) {
				if(interfaceClass.getName() == Task.class.getName()) {
					isTargetTask = true;
					break;
				}
			}
			
			MultiValueMap<String, Object> attributes = metadataReader.getAnnotationMetadata()
					.getAllAnnotationAttributes(TaskConfigure.class.getName());
			if(attributes == null || attributes.isEmpty()) {
				isTargetTask = false;
			}
			if(isTargetTask) {
				this.setConfigureBean(attributes);
				this.setTaskClass(clazz);
			}else {
				throw new SystemException();
			}
		}
	}
	
	public void setConfigureBean(ConfigureBean configureBean) {
		this.configureBean = configureBean;
	}

	public void setConfigureBean(MultiValueMap<String, Object> attributes) throws Exception{
		this.configureBean = new ConfigureBean();
		this.configureBean.setDelay(Long.valueOf(attributes.get("delay").get(0).toString()));
		this.configureBean.setStartPattern(StartPattern.valueOf(attributes.get("startPattern").get(0).toString()));
		String executeTime = attributes.get("executeTime").get(0).toString();
		if(executeTime == null || executeTime.equals("")) {
			if(this.configureBean.getStartPattern() == StartPattern.timing_execution ||
					this.configureBean.getStartPattern() == StartPattern.timing_interval_execution) {
				throw new CustomException("scheduled task configure error","executeTime 在startPattern=timing_execution或者"
						+ "startPattern=timing_interval_execution的模式下，必须正确配置");
			}
		}else {
			SimpleDateFormat dateFormat = new SimpleDateFormat("HH-mm-ss"); 
			try {
				dateFormat.parse(executeTime);
			} catch (Exception e) {
				throw new CustomException("scheduled task configure error","executeTime value format HH-mm-ss");
			}
		}
		this.configureBean.setExecuteTime(attributes.get("executeTime").get(0).toString());
		this.configureBean.setInterval(Long.valueOf(attributes.get("interval").get(0).toString()));
		this.configureBean.setRestartPattern(RestartPattern.valueOf(attributes.get("restartPattern").get(0).toString()));
		
		this.configureBean.setTaskName(attributes.get("taskName").get(0).toString());
		
	}
	
	@SuppressWarnings("unchecked")
	public void setTaskClass(Class<?> taskClass) throws InstantiationException, IllegalAccessException {
		this.taskClass = (Class<Task>)taskClass;
	}

	public Class<Task> getTaskClass() {
		return taskClass;
	}

	public ConfigureBean getConfigureBean() {
		return configureBean;
	}

	public Task getTask() {
		return task;
	}

	public void setTask(Task task) {
		this.task = task;
	}
	
}
