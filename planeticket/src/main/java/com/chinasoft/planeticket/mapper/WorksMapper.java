package com.chinasoft.planeticket.mapper;

import java.util.List;

import com.chinasoft.planeticket.pojo.Plane;
import com.chinasoft.planeticket.pojo.Works;

public interface WorksMapper {

	//目的地查询
	List<Works> queryPlanenum(Plane plane);
	//航班号
	List<Works> queryEndplace(Plane plane);
	//全部
	List<Works> queryAll(Plane plane);
	
}
