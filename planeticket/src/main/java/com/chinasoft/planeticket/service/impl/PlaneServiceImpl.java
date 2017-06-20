package com.chinasoft.planeticket.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.chinasoft.planeticket.mapper.PlaneMapper;
import com.chinasoft.planeticket.pojo.Plane;
import com.chinasoft.planeticket.service.IPlaneService;
@Service("planeService")
public class PlaneServiceImpl implements IPlaneService{
	
	@Resource PlaneMapper planetMapper;
/**
 * 查询
 */
	@Override
	public List<Plane> findAllPlane() {
		// TODO Auto-generated method stub
		return planetMapper.findAllPlane();
	}
	@Override
	public List<Plane> selectPlane(String plane) {
		// TODO Auto-generated method stub
		return planetMapper.selectPlane(plane);
	}

/**
 * 添加
 */
	public boolean insertPlane(Plane plane) {
	// TODO Auto-generated method stub
	return planetMapper.insertPlane(plane);
}









}
