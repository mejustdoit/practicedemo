package com.example.aily.xml.consumer;

import com.example.aily.echo.xml.api.EchoService;
import com.example.aily.xml.consumer.utils.SpringUtil;
import java.io.IOException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * @author shitao
 * @date: 2020/5/31 下午12:00
 * @discription 尝试几种注入方式，获取Bean方式 1. 注解方式@ImportResource("classpath:/spring/echo-consumer.xml")
 * @SpringBootApplication 使用 SpringApplication.run(ConsumerXmlApplication.class, args); EchoService
 * echoService = (EchoService) applicationContext.getBean("echoService"); 2. 使用导入的方式
 * ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new
 * String[]{"spring/echo-provider.xml"}); 使用context.getBean()
 */
@ImportResource("classpath:/spring/echo-consumer.xml")
@SpringBootApplication
public class ConsumerXmlApplication {

	private static final Logger logger = LoggerFactory.getLogger(ConsumerXmlApplication.class);

	public static void main(String[] args) throws IOException {
		SpringApplication.run(ConsumerXmlApplication.class, args);
		EchoService echoService = SpringUtil.getObject(EchoService.class);
		String status = echoService.echo("hello word!");
		System.out.println("dubbo rpc call result is :" + status);
		logger.info("dubbo rpc call result is : {}", status);
		System.in.read();

	}

}
