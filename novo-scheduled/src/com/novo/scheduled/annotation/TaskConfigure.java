package com.novo.scheduled.annotation;

import com.novo.scheduled.config.RestartPattern;
import com.novo.scheduled.config.StartPattern;

import java.lang.annotation.Documented;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Documented
@Inherited
@Retention(RUNTIME)
@Target(TYPE)
//@Component
public @interface TaskConfigure{
	
	public String taskName();
	
	public long interval() default 1000l;
	
	public long delay() default 0l;
	
	public RestartPattern restartPattern() default RestartPattern.stop_restart;
	
	public StartPattern startPattern() default StartPattern.interval_execution;
	
	public String executeTime() default "";
}
