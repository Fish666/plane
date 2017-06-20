package com.chinasoft.planeticket.mapper;

import java.util.List;

import com.chinasoft.planeticket.pojo.Plane;

public interface PlaneMapper {
	/**
	 * 添加
	 * @param plane
	 * @return
	 */
	public boolean insertPlane(Plane plane); 
	/**
	 * 删除
	 * @param plane
	 * @return
	 */
	Plane deletePlane(Plane plane);
	/**
	 * 查询
	 * @param plane
	 * @return
	 */
	public List<Plane> findAllPlane();
	public List<Plane> selectPlane(String plane); 
}	
