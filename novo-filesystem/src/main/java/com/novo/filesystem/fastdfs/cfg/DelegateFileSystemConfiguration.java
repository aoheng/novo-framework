/**
 * 
 */
package com.novo.filesystem.fastdfs.cfg;

import com.novo.filesystem.FastDfsStorageProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * @description <br>
 * @author aoheng
 * @date 2020年3月28日
 */
@Configuration
@EnableConfigurationProperties(FileSystemProperties.class)
@ConditionalOnClass(FastDfsStorageProvider.class)
public class DelegateFileSystemConfiguration {

	@Autowired
	private FileSystemProperties pProperties;

	@Bean
	public FastDfsStorageProvider fileSystemProvider() {

		FastDfsStorageProvider bean = new FastDfsStorageProvider();
		bean.setGroupName(pProperties.getGroupName());
		bean.setProvider(pProperties.getProvider());
		bean.setServers(pProperties.getServers());
		bean.setUrlprefix(pProperties.getUrlprefix());
		bean.setConnectTimeout(pProperties.getConnectTimeout());
	

		return bean;
	}

	
	
}
