package com.chinasoft.planeticket.controller;


import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.chinasoft.planeticket.pojo.Ficket;
import com.chinasoft.planeticket.pojo.Plane;
import com.chinasoft.planeticket.service.IFicketService;
import com.chinasoft.planeticket.service.IPlaneService;

import net.sf.json.JSONObject;


@Controller
@RequestMapping("/plane")
public class PlaneController {
	@Resource
	private IPlaneService iPlaneService;
	
	
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
	@RequestMapping("/insert")
	public String Insert(){
		return "Plane";
	}
	
	@RequestMapping("/insertPlane")
	@ResponseBody	
	public JSONObject insertPlanes(Plane plane){
		JSONObject insert=new JSONObject();
		if (iPlaneService.insertPlane(plane)) {
			insert.put("航班", "添加成功");
		}else {
			insert.put("航班", "添加失败");
		}
		return insert;
	} 
	
}
