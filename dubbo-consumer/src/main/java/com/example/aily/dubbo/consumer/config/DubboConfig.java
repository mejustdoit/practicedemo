package com.example.aily.dubbo.consumer.config;

import com.example.aily.dubbo.common.service.UserService;
import org.apache.dubbo.config.ApplicationConfig;
import org.apache.dubbo.config.ReferenceConfig;
import org.apache.dubbo.config.RegistryConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Description TODO
 * @Author dingshitao
 * @Date 2020/5/30 下午10:46
 * @Version 1.0
 **/
@Configuration
public class DubboConfig {

	private String zkAddress = "127.0.0.1";

	@Bean
	public ApplicationConfig applicationConfig() {
		ApplicationConfig application = new ApplicationConfig();
		application.setName("dubbo-consumer");
		return application;
	}

	@Bean
	public RegistryConfig registryConfig() {
		RegistryConfig registry = new RegistryConfig();
		registry.setId("zookeeper");
		registry.setAddress(zkAddress);
		registry.setProtocol("dubbo");
		registry.setCheck(false);
		registry.setRegister(true);
		return registry;
	}

	@Bean
	public UserService getUserServiceApi(ApplicationConfig applicationConfig, RegistryConfig registryConfig) {
		UserService userServiceApi = getReferenceService(applicationConfig, registryConfig, UserService.class, 1, 200);
		return userServiceApi;
	}

	public <T> T getReferenceService(ApplicationConfig applicationConfig, RegistryConfig registryConfig, Class<T> interfaceClass, int retries, int timeout) {
		return getReferenceService(applicationConfig, registryConfig, interfaceClass, retries, timeout, false);
	}

	public <T> T getReferenceService(ApplicationConfig applicationConfig, RegistryConfig registryConfig, Class<T> interfaceClass, int retries, int timeout, boolean check) {
		ReferenceConfig<T> reference = new ReferenceConfig();
		reference.setApplication(applicationConfig);
		reference.setRegistry(registryConfig);
		reference.setRetries(retries);
		reference.setTimeout(timeout);
		reference.setCheck(check);
		reference.setInterface(interfaceClass);
		return reference.get();
	}


}
