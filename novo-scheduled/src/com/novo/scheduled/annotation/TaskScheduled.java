package com.novo.scheduled.annotation;

import com.novo.scheduled.context.ScheduledContext;
import com.novo.scheduled.context.TaskScheduledRegistrar;
import org.springframework.context.annotation.Import;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Documented
@Retention(RUNTIME)
@Target(TYPE)
@Import({TaskScheduledRegistrar.class,ScheduledContext.class})
public @interface TaskScheduled {
	
	public String[] value();
}
