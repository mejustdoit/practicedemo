package com.example.aily.dubbo.provider.service.impl;


import com.example.aily.dubbo.common.model.UserAdress;
import com.example.aily.dubbo.common.service.UserService;
import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.annotation.Value;

/**
 * @Description TODO
 * @Author dingshitao
 * @Date 2020/5/27 上午9:15
 * @Version 1.0
 **/
public class UserServiceImpl implements UserService {
	@Value("127.0.0.1")
	private  String adress;

	@Override
	public List<UserAdress> getUserAdressList(String userId) {
		UserAdress adress1 = new UserAdress(1,   "北京市昌平区华龙苑南里10-6-402", "aily", "13106682831");
		UserAdress adress2 = new UserAdress(2,   "北京市海淀区北坞嘉园10-6-402", "aily", "13552132919");
		UserAdress adress3 = new UserAdress(3,   "河南省濮阳市濮阳县盛世佳苑5-5-702", "aily", "13106682831");
		return Arrays.asList(adress1, adress2, adress3);
	}

}
