package com.chinasoft.planeticket.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.chinasoft.planeticket.mapper.UserMapper;
import com.chinasoft.planeticket.pojo.Page;
import com.chinasoft.planeticket.pojo.User;
import com.chinasoft.planeticket.service.UserService;

@Service("userServiceImpl")
public class UserServiceImpl implements UserService{
	@Resource private UserMapper userMapper;

	@Override
	public boolean insertUser(User user) {
		// TODO Auto-generated method stub
		return userMapper.insertUser(user);
	}

	@Override
	public boolean deleteUser(int[] ids) {
		// TODO Auto-generated method stub
		return userMapper.deleteUser(ids);
	}

	@Override
	public boolean updateUser(User user) {
		// TODO Auto-generated method stub
		return userMapper.updateUser(user);
	}

	@Override
	public List<User> findAll(User user) {
		// TODO Auto-generated method stub
		return userMapper.findAll(user);
	}

	@Override
	public User queryUser(User user) {
		// TODO Auto-generated method stub
		return userMapper.queryUser(user);
	}

	@Override
	public String total(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void queryUsers(Page<User> page) {
		// TODO Auto-generated method stub
		List<User> list=userMapper.queryUsers(page);
		int total=userMapper.queryCount(page);
		page.setRows(list);
		page.setTotal(total);	
	}
	
	
}
