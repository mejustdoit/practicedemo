package com.example.aily.dubbo.common.service;


import com.example.aily.dubbo.common.model.UserAdress;
import java.util.List;

/**
 * @Description TODO
 * @Author dingshitao
 * @Date 2020/5/27 上午9:12
 * @Version 1.0
 **/
public interface UserService {
	public List<UserAdress> getUserAdressList(String userId);
}
