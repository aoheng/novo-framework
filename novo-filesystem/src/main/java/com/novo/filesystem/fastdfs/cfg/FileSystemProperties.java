/**
 * 
 */
package com.novo.filesystem.fastdfs.cfg;

import org.springframework.boot.bind.RelaxedPropertyResolver;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;

import java.util.Map;
import java.util.Properties;

/**
 * @description <br>
 * @author aoheng
 * @date 2020年12月31日
 */
@ConfigurationProperties(prefix="novo.filesystem")
public class FileSystemProperties implements EnvironmentAware{

	

	private String provider;
	private String groupName;
	private String servers;
	private String urlprefix;
	private int connectTimeout;

	private Properties configs = new Properties();
	
	

	public String getProvider() {
		return provider;
	}



	public void setProvider(String provider) {
		this.provider = provider;
	}



	public String getGroupName() {
		return groupName;
	}



	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}



	public String getServers() {
		return servers;
	}



	public void setServers(String servers) {
		this.servers = servers;
	}



	public String getUrlprefix() {
		return urlprefix;
	}



	public void setUrlprefix(String urlprefix) {
		this.urlprefix = urlprefix;
	}



	public int getConnectTimeout() {
		return connectTimeout;
	}



	public void setConnectTimeout(int connectTimeout) {
		this.connectTimeout = connectTimeout;
	}



	@Override
	public void setEnvironment(Environment environment) {
		RelaxedPropertyResolver resolver = new RelaxedPropertyResolver(environment, "yqjp.filesystem.");
		Map<String, Object> subProperties = resolver.getSubProperties("");
		if(subProperties != null && !subProperties.isEmpty()){
			configs.putAll(subProperties);
		}
	}
	
	
	
}
