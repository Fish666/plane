package com.chinasoft.planeticket.service;

import java.util.List;

import com.chinasoft.planeticket.pojo.User;

public interface UserService {
	 boolean insertUser(User user);
	
	 boolean deleteUser(User user);
	
	 boolean updateUser(User user);
	
	List<User> findAll(User user);
	
	List<User> queryUser(User user);
	
	String total(User user);
	
	User findById(int ids);
}
