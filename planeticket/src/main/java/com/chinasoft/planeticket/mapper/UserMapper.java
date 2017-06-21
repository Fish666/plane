package com.chinasoft.planeticket.mapper;

import java.util.List;

import com.chinasoft.planeticket.pojo.User;

public interface UserMapper {
	
//	添加用户
	public int insertUser(User user);

// 	删除用户
	public int deleteUser(User user);
	
// 	查询用户
	public User queryUser(User user);
	
//  修改用户
	public int updateUser(User user);
	
	
	
	String total(User user);
	
	List<User> findAll(User user);
}
