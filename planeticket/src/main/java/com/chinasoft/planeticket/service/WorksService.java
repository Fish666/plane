package com.chinasoft.planeticket.service;

import java.util.List;

import com.chinasoft.planeticket.pojo.Plane;
import com.chinasoft.planeticket.pojo.Works;

public interface WorksService {

	
	List<Works> queryWorks(Plane plane);
}
