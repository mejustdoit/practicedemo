package com.example.aily.xml.consumer.utils;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * @Description TODO
 * @Author dingshitao
 * @Date 2020/5/31 下午12:16
 * @Version 1.0
 **/
@Component
public class SpringUtil implements ApplicationContextAware {

	private static ApplicationContext applicationContext;

	@Override
	public void setApplicationContext(ApplicationContext arg) throws BeansException {
		applicationContext = arg;
	}

	public static <T> T getObject(String id, Class<T> aClass) {
		return (T) applicationContext.getBean(id);
	}

	public static <T> T getObject(Class<T> type) {
		if (applicationContext == null) {
			return null;
		}
		return applicationContext.getBean(type);
	}
}