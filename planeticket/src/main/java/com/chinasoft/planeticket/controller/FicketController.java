package com.chinasoft.planeticket.controller;


import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.chinasoft.planeticket.pojo.Ficket;
import com.chinasoft.planeticket.service.IFicketService;

import net.sf.json.JSONObject;


@Controller
@RequestMapping("/ficket")
public class FicketController {
	@Resource
	private IFicketService iFicketService;
	
	
/*	@RequestMapping("/findFicke")
	@ResponseBody
	public String findFicke(Ficket ficket){
		List<Ficket> find=iFicketService.findAllFicket();
		 ficketAll=find;
		return query;
	}*/
	
	
	/**
	 * 添加跳转
	 * @return
	 */
	@RequestMapping("/inser")
	public String Insert(){
		System.out.println("++++++");
		return "FicketView";
	}
	
	@RequestMapping("/insertFicket")
	@ResponseBody
	public JSONObject insertFicket(Ficket ficket){
		JSONObject insert=new JSONObject();
		 System.out.println("++++++++");
		 System.out.println("添加"+insert.toString());
		if (iFicketService.insertFicket(ficket)) {
			insert.put("status", 1);
			insert.put("tid", "添加成功");
		}else {
			insert.put("status", 0);
			insert.put("tid", "添加失败");
		}
		return insert;
	} 
	
}
