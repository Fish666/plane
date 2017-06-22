package com.chinasoft.planeticket.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.chinasoft.planeticket.mapper.WorksMapper;
import com.chinasoft.planeticket.pojo.Plane;
import com.chinasoft.planeticket.pojo.Works;
import com.chinasoft.planeticket.service.WorksService;

@Service("WorksServiceImpl")
public class WorksServiceImpl implements WorksService {

	@Resource WorksMapper worksMapper;
	
	@Override
	public List<Works> queryWorks(Plane plane) {
		
		String str=plane.getFendplace();
		String str1=plane.getFplanenum();

			System.out.println("目的地："+str+" "+"航班号："+str);
		if(str!="" && str1==""){
		
			return worksMapper.queryEndplace(plane);
		}
		else if(str1!="" && str==""){
			
			return worksMapper.queryPlanenum(plane); }else{
		
		return worksMapper.queryAll(plane);}
	}

}
