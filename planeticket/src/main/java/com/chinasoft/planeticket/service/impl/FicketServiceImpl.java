package com.chinasoft.planeticket.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.chinasoft.planeticket.mapper.FicketMapper;
import com.chinasoft.planeticket.pojo.Ficket;
import com.chinasoft.planeticket.service.IFicketService;
@Service("ficketService")
public class FicketServiceImpl implements IFicketService{
	
	@Resource FicketMapper ficketMapper;
/**
 * 查询
 */
	@Override
	public List<Ficket> findAllFicket() {
		// TODO Auto-generated method stub
		return ficketMapper.findAllFicket();
	}
	@Override
	public List<Ficket> selectFicket(String ficket) {
		// TODO Auto-generated method stub
		return ficketMapper.selectFicket(ficket);
	}

/**
 * 添加
 */
	@Override
	public boolean insertFicket(Ficket ficket) {
		// TODO Auto-generated method stub
		return ficketMapper.insertFicket(ficket);
		
	}









}
