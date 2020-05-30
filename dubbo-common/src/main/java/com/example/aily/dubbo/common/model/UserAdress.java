package com.example.aily.dubbo.common.model;

import java.io.Serializable;
import lombok.Data;

/**
 * @Description TODO
 * @Author dingshitao
 * @Date 2020/5/27 上午9:05
 * @Version 1.0
 **/
@Data
public class UserAdress implements Serializable {
	private Integer id;
	private String userAdress;
	private String userName;
	private String phoneNum;

	public UserAdress(Integer id, String userAdress, String userName, String phoneNum){
		this.id = id;
		this.userAdress = userAdress;
		this.userName = userName;
		this.phoneNum = phoneNum;
	}

}
