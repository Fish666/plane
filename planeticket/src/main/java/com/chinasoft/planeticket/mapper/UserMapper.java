package com.chinasoft.planeticket.mapper;

import java.util.List;

import com.chinasoft.planeticket.pojo.Page;
import com.chinasoft.planeticket.pojo.User;

public interface UserMapper {
	//添加
	 boolean insertUser(User user);
	//删除
	 boolean deleteUser(int[] ids);
	//修改
	 boolean updateUser(User user);
	//查询所有
	List<User> findAll(User user);
	
	User queryUser(User user);
	
	
	String total(User user);
	
	List<User> queryUsers(Page<User> page);
	
	int queryCount(Page<User> page);
}
