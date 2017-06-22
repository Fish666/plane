package com.chinasoft.planeticket.service;

import java.util.List;

import com.chinasoft.planeticket.pojo.User;

public interface UserService {
	public int insertUser(User user);
	
	public int deleteUser(User user);
	
	public int updateUser(User user);
	
	public List<User> findAll(User user);
	
	public User queryUser(User user);
	
	static String total(User user) {
		// TODO Auto-generated method stub
		return null;
	}
}
