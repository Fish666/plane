package com.chinasoft.planeticket.service.impl;


import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.chinasoft.planeticket.mapper.AdminsMapper;
import com.chinasoft.planeticket.pojo.Admins;
import com.chinasoft.planeticket.service.AdminsService;

@Service("AdminsServiceImpl")
public class AdminsServiceImpl implements AdminsService{

	@Resource AdminsMapper adminsMapper;
	

	@Override
	public Admins query(Admins admins) {
		// TODO Auto-generated method stub				
			
		return adminsMapper.query(admins);
	}

}
