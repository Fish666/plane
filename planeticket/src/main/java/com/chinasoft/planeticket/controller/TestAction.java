package com.chinasoft.planeticket.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.chinasoft.planeticket.pojo.Test;
import com.chinasoft.planeticket.service.ITestService;



@Controller
@RequestMapping("/test")
public class TestAction {
	
	@Autowired
	private ITestService iTestService;
	
	@RequestMapping("/doLogin")
	@ResponseBody
	public Test doLogin(Test test){
		Test login=iTestService.queryTest(test);
		return login;
		
	}
}
