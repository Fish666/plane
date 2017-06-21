package com.chinasoft.planeticket.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.chinasoft.planeticket.pojo.User;
import com.chinasoft.planeticket.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	@Resource private UserService userService;
	
	@RequestMapping("/insertUser")
	@ResponseBody
	public User insertUser(User user){
		int insertuser=userService.insertUser(user);
		System.out.println(insertuser);
		return user;
		
	}
	
	@RequestMapping("/deleteUser")
	@ResponseBody
	public User deleteUser(User user){
		int deleteuser=userService.deleteUser(user);
		System.out.println(deleteuser);
		return user;
	}
	
	@RequestMapping("/updateUser")
	@ResponseBody
	public User updateUser(User user){
		int updateuser=userService.updateUser(user);
		System.out.println(updateuser);
		return user;
	}
	
	
	@RequestMapping("/findAll")
	@ResponseBody
	public Map findAll(User user){
		List<User> queryuser= userService.findAll(user);
		for (User user2 : queryuser) {
			System.out.println(user2.toString());
		}
		String total=UserService.total(user);
		Map map=new HashMap<String,Object>();
		map.put("rows", user);
		map.put("total", total);
		return map;
		
	}
}
