package com.chinasoft.planeticket.service;

import java.util.List;

import com.chinasoft.planeticket.pojo.Plane;

public interface IPlaneService {
		
	/**
	 * 查询
	 * @param Plane
	 * @return 
	 */
	public List<Plane> findAllPlane();
	public List<Plane> selectPlane(String Plane); 
	
	/**
	 * 添加
	 * @param Plane
	 * @return
	 */
	public  boolean insertPlane(Plane plane); 
}
