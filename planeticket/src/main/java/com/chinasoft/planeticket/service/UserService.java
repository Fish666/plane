package com.chinasoft.planeticket.service;

import java.util.List;

import com.chinasoft.planeticket.pojo.Page;
import com.chinasoft.planeticket.pojo.User;

public interface UserService {
	 boolean insertUser(User user);
	
	 boolean deleteUser(int[] ids);
	
	 boolean updateUser(User user);
	
	List<User> findAll(User user);
	
	User queryUser(User user);
	
	String total(User user);
	
	User findById(int id);
	
	void queryUsers(Page<User> page);
}
