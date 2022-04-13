package com.novo.scheduled.context;

import com.novo.scheduled.Task;
import com.novo.scheduled.annotation.TaskConfigure;
import org.springframework.beans.factory.annotation.AnnotatedBeanDefinition;
import org.springframework.beans.factory.config.BeanDefinitionHolder;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.context.annotation.ClassPathBeanDefinitionScanner;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.core.type.classreading.CachingMetadataReaderFactory;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;
import org.springframework.core.type.filter.AssignableTypeFilter;
import org.springframework.core.type.filter.TypeFilter;
import org.springframework.util.MultiValueMap;

import java.io.IOException;
import java.util.LinkedHashSet;
import java.util.Set;

public class ClassPathTaskScanner extends ClassPathBeanDefinitionScanner{
	
	private MetadataReaderFactory metadataReaderFactory;
	@Override
	public Set<BeanDefinitionHolder> doScan(String... basePackages) {
		Set<BeanDefinitionHolder> beanDefinitions = super.doScan(basePackages);

	    if (beanDefinitions.isEmpty()) {
	    } else {
		  try {
				processBeanDefinitions(beanDefinitions);
		  } catch (Exception e) {
				e.printStackTrace();
				PrepareTaskPool.setPrepareStatus(false);
		  }
	    }
	    return beanDefinitions;
	}
	public void registerFilters() {
		
		addIncludeFilter(new AssignableTypeFilter(Task.class) {
			@Override
			public boolean match(MetadataReader metadataReader, MetadataReaderFactory metadataReaderFactory) {
				String interfaceNames[] = metadataReader.getClassMetadata().getInterfaceNames();
				for(String interfaceName : interfaceNames) {
					return this.matchInterface(interfaceName);
				}
				return false;
			}
		});

		// exclude package-info.java
		addExcludeFilter(new TypeFilter() {
			@Override
			public boolean match(MetadataReader metadataReader, MetadataReaderFactory metadataReaderFactory)
					throws IOException {
				String className = metadataReader.getClassMetadata().getClassName();
				return className.endsWith("package-info");
			}
		});
	}

	public Set<Class<Task>> processBeanDefinitions(Set<BeanDefinitionHolder> beanDefinitions) throws Exception {
		GenericBeanDefinition definition;
	    for (BeanDefinitionHolder holder : beanDefinitions) {
	      definition = (GenericBeanDefinition) holder.getBeanDefinition();
	      definition.setAutowireMode(AbstractBeanDefinition.AUTOWIRE_BY_TYPE);
	      Resource resource = (Resource)definition.getSource();
	      MetadataReader metadataReader = this.metadataReaderFactory.getMetadataReader(resource);
	      TaskMetadata metadata = new TaskMetadata(metadataReader);
	      PrepareTaskPool.put(metadata.getConfigureBean().getTaskName(), metadata);
	      
	    }
		Set<Class<Task>> candidates = new LinkedHashSet<Class<Task>>();
		return candidates;
	}
	
	@Override
	protected boolean isCandidateComponent(AnnotatedBeanDefinition beanDefinition) {
		MultiValueMap<String, Object> attributes = beanDefinition.getMetadata().getAllAnnotationAttributes(TaskConfigure.class.getName());
		return attributes == null || attributes.isEmpty() ? false : true;
	}
	@Override
	public void setResourceLoader(ResourceLoader resourceLoader) {
		super.setResourceLoader(resourceLoader);
		this.metadataReaderFactory = new CachingMetadataReaderFactory(resourceLoader);
	}
	public ClassPathTaskScanner(BeanDefinitionRegistry registry) {
		super(registry, false);
	}
}
