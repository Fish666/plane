package com.chinasoft.planeticket.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.chinasoft.planeticket.pojo.Ficket;
import com.chinasoft.planeticket.pojo.User;
import com.chinasoft.planeticket.service.UserService;

@Controller
@RequestMapping("/view")
public class UserController {
	@Resource private UserService userService;
	
	@RequestMapping("/touserlogin")
	public String toCenter(HttpSession session,Ficket ficket){
		String uString=(String) session.getAttribute("uString");
			System.out.println("==="+uString);
		return "UserMain";
	}
	
	
	
	
	
	
	@RequestMapping("/insertUser")
	@ResponseBody
	public User insertUser(User user){
		boolean insertuser=userService.insertUser(user);
		System.out.println(insertuser);
		return user;
		
	}
	
	@RequestMapping("/deleteUser")
	@ResponseBody
	public User deleteUser(User user){
		boolean deleteuser=userService.deleteUser(user);
		System.out.println(deleteuser);
		return user;
	}
	
	@RequestMapping("/updateUser")
	@ResponseBody
	public User updateUser(User user){
		boolean updateuser=userService.updateUser(user);
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
		String total=userService.total(user);
		Map map=new HashMap<String,Object>();
		map.put("rows", queryuser);
		map.put("total", total);
		return map;
	}
	
	@RequestMapping("/queryUser")
	@ResponseBody
	public Map queryUser(User user){
		List<User>	queryuser=userService.queryUser(user);
		for (User user2 : queryuser) {
			System.out.println(user2.toString());
		}
		String total=userService.total(user);
		Map map=new HashMap<String,Object>();
		map.put("rows", queryuser);
		map.put("total", total);
		return map;
	}
}	

