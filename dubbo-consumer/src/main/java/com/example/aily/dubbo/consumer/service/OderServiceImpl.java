package com.example.aily.dubbo.consumer.service;

import com.example.aily.dubbo.common.service.OderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description
 * 1. 将提供者注册到注册中心
 * 2. 消费者订阅注册中心消息
 * @Author dingshitao
 * @Date 2020/5/27 上午9:44
 * @Version 1.0
 **/
public class OderServiceImpl implements OderService {
	private static final Logger logger = LoggerFactory.getLogger(OderServiceImpl.class);



	@Override
	public void initOrder(String userId) {

	}
}
