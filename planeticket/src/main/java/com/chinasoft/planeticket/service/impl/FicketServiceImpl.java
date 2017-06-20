package com.chinasoft.planeticket.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.chinasoft.planeticket.mapper.FicketMapper;
import com.chinasoft.planeticket.pojo.Ficket;
import com.chinasoft.planeticket.pojo.Page;
import com.chinasoft.planeticket.service.IFicketService;
@Service("ficketService")
public class FicketServiceImpl implements IFicketService{
	
	@Resource FicketMapper ficketMapper;

	/**
	 *查询
	 */
	@Override
	public Ficket queryFicket(Ficket ficket) {
		// TODO Auto-generated method stub
		return ficketMapper.queryFicket(ficket);
	}
	/**
	 * 添加
	 */
	@Override
	public boolean insertFicket(Ficket ficket) {
		// TODO Auto-generated method stub
		return ficketMapper.insertFicket(ficket);
	}
	/**
	 * 修改
	 */
	@Override
	public boolean updateFicket(Ficket ficket) {
		// TODO Auto-generated method stub
		return ficketMapper.updateFicket(ficket);
	}
	/**
	 * 删除
	 */
	@Override
	public boolean deleteFicket(String ids) {
		// TODO Auto-generated method stub
		return ficketMapper.deleteFicket(ids);
	}

	@Override
	public String total(Ficket ficket) {
		// TODO Auto-generated method stub
		return null;
	}
	/**
	 * 查询所有
	 */
	@Override
	public List<Ficket> findAll(Ficket ficket) {
		// TODO Auto-generated method stub
		return ficketMapper.findAll(ficket);
	}
	@Override
	public Ficket findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void queryUsers(Page<Ficket> page) {
		// TODO Auto-generated method stub
		List<Ficket> list=ficketMapper.queryUsers(page);
		int total=ficketMapper.queryCount(page);
		page.setRows(list);
		page.setTotal(total);	
	}
	

}
