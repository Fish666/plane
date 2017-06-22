package com.chinasoft.planeticket.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.jasper.tagplugins.jstl.core.ForEach;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.chinasoft.planeticket.pojo.Ficket;
import com.chinasoft.planeticket.pojo.Plane;
import com.chinasoft.planeticket.pojo.Works;
import com.chinasoft.planeticket.service.WorksService;

@Controller
@RequestMapping("/works")
public class WorksController {

	@Resource private WorksService worksService;
	
	
	@RequestMapping("/queryWorks")
	@ResponseBody
	public Map queryWorks(Plane plane){
		
		List<Works> list=worksService.queryWorks(plane);
       for (Works works : list) {
		System.out.println(works.getWcaptain().toString());
	}
		Map map=new HashMap<String,Object>();
		map.put("rows", list);
		map.put("total", "1");
		return map;
	}
}
