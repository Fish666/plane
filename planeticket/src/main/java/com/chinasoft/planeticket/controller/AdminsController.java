package com.chinasoft.planeticket.controller;


import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.chinasoft.planeticket.pojo.Admins;
import com.chinasoft.planeticket.service.AdminsService;

@Controller
@RequestMapping("/admins")
public class AdminsController {
   
	
	@Resource
	private AdminsService adminsService;
	
	@RequestMapping("/adminsLogin")
	@ResponseBody
	public String query(Admins admins){
		Admins login=adminsService.query(admins);
		if(login==null){
			return "1";
		}else{
			String str=login.getAdpowers();
			switch (str) {
			case "1":
				
				return "";
				
            case "2":
				
				return "";

			default:
				break;
			}
			return "";
		}
					
		
	}
}
