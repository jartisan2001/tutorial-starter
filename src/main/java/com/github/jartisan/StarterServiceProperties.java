package com.github.jartisan;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix="tutorial.biz")
public class StarterServiceProperties {
	
	private String config;

	public void setConfig(String config) {
		this.config = config;
	}

	public String getConfig() {
		return config;
	}
}
