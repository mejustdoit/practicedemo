package com.example.aily.dubbo.provider;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DubboProviderApplication {

	private static final Logger logger = LoggerFactory.getLogger(DubboProviderApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(DubboProviderApplication.class, args);
	}

}
