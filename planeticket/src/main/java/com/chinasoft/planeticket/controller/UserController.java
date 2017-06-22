package com.chinasoft.planeticket.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.chinasoft.planeticket.pojo.User;
import com.chinasoft.planeticket.service.UserService;

import net.sf.json.JSONObject;

@Controller
@RequestMapping("/view")
public class UserController {
	@Resource private UserService userService;
	
	@RequestMapping("/tousermain")
	public String toCenter(HttpSession session,User user){
		String uString=(String) session.getAttribute("uString");
			System.out.println("==="+uString);
		return "UserMain";
	}
	@RequestMapping("/tologin")
	public String getLogin(int id,HttpServletRequest request,Model model){
		request.setAttribute("user", userService.findById(id));
		model.addAttribute("user",userService.findById(id));
		return null;
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
	public JSONObject deleteUser(int[] ids){
		JSONObject json=new JSONObject();
		System.out.println(ids);
		if (userService.deleteUser(ids)) {
			json.put("status", 1);
			json.put("tip", "删除成功");
		}else {
			json.put("status", 0);
			json.put("tip", "删除失败");
		}
		return json;
	}
	
	@RequestMapping("/updateUser")
	@ResponseBody
	public JSONObject updateUser(User user){
		JSONObject json=new JSONObject();
		System.out.println(user);
		if (userService.updateUser(user)) {
			json.put("status", 1);
			json.put("tip", "修改失败");
		}else {
			json.put("status", 0);
			json.put("tip", "修改成功");
		}
		return json;
	}
	
	
	@RequestMapping("/findAll")
	@ResponseBody
	public Map findAll(User queryUser){
		List<User> queryusers= userService.findAll(queryUser);
		for (User user2 : queryusers) {
			System.out.println(user2.toString());
		}
		String total=userService.total(queryUser);
		Map map=new HashMap<String,Object>();
		map.put("rows", queryusers);
		map.put("total", total);
		return map;
	}
	
	
}	

