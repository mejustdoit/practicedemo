package com.example.aily.echo.xml.provider.impl;

import com.example.aily.echo.xml.api.EchoService;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.dubbo.rpc.RpcContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description TODO
 * @Author dingshitao
 * @Date 2020/5/30 下午11:19
 * @Version 1.0
 **/
public class EchoServiceImpl implements EchoService {
	private final Logger logger = LoggerFactory.getLogger(EchoServiceImpl.class);

	@Override
	public String echo(String message) {
		String now = new SimpleDateFormat("HH:mm:ss").format(new Date());
		System.out.println("[ " + now + " ] hello " + message + ", request from consumer:" +
				RpcContext.getContext().getRemoteAddress());
		logger.info(" get message is {}",message);
		return "终于等到你： " + message;
	}
}
