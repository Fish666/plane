package com.chinasoft.planeticket.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.chinasoft.planeticket.mapper.UserMapper;
import com.chinasoft.planeticket.pojo.User;
import com.chinasoft.planeticket.service.UserService;

@Service("userServiceImpl")
public class UserServiceImpl implements UserService{
	@Resource private UserMapper userMapper;
	
	
	@Override
	public int insertUser(User user) {
		// TODO Auto-generated method stub
		return userMapper.insertUser(user);
	}


	@Override
	public int deleteUser(User user) {
		// TODO Auto-generated method stub
		return userMapper.deleteUser(user);
	}


	@Override
	public int updateUser(User user) {
		// TODO Auto-generated method stub
		return userMapper.updateUser(user);
	}


	@Override
	public User queryUser(User user) {
		// TODO Auto-generated method stub
		return userMapper.queryUser(user);
	}


	@Override
	public List<User> findAll(User user) {
		// TODO Auto-generated method stub
		return userMapper.findAll(user);
	}

	public String total(User user) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
