package com.novo.scheduled.context;

import com.novo.scheduled.annotation.TaskScheduled;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.annotation.AnnotationAttributes;
import org.springframework.core.io.ResourceLoader;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class TaskScheduledRegistrar implements ImportBeanDefinitionRegistrar,ResourceLoaderAware{
	
	private ResourceLoader resourceLoader;
	
	@Override
	public void setResourceLoader(ResourceLoader resourceLoader) {
		this.resourceLoader = resourceLoader;
	}

	@Override
	public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
		AnnotationAttributes annoAttrs = AnnotationAttributes.fromMap(importingClassMetadata.getAnnotationAttributes(TaskScheduled.class.getName()));
		ClassPathTaskScanner scanner = new ClassPathTaskScanner(registry);
		if(resourceLoader != null) {
			scanner.setResourceLoader(resourceLoader);
		}
		List<String> basePackages = new ArrayList<String>();
	    for (String pkg : annoAttrs.getStringArray("value")) {
	      if (StringUtils.hasText(pkg)) {
	        basePackages.add(pkg);
	      }
	    }
	    scanner.registerFilters();
	    scanner.doScan(StringUtils.toStringArray(basePackages));
	}

}
