package com.example.aily.echo.xml.provider;

import java.io.IOException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Description TODO
 * @Author dingshitao
 * @Date 2020/5/30 下午11:31
 * @Version 1.0
 **/

//@ImportResource("classpath:/spring/echo-provider.xml")
public class EchoProvider {

	private static final Logger logger = LoggerFactory.getLogger(EchoProvider.class);

	public static void main(String[] args) throws IOException {
		logger.info("加载配置文件。。。。。。。");
		//指定暴露的配置文件
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"spring/echo-provider.xml"});
		//ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(args);

		logger.info("加载配置文件结束。。。。。。");
		logger.info("启动spring。。。。。。。。");
		//启动spring容器
		context.start();
		logger.info("启动spring 完成。。。。。。");
		System.in.read();
	}

}
