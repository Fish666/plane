package com.chinasoft.planeticket.service;

import java.util.List;

import com.chinasoft.planeticket.pojo.Ficket;
import com.chinasoft.planeticket.pojo.Page;

public interface IFicketService {
	Ficket queryFicket(Ficket ficket);
	/**
	 * 添加
	 * @param ficket
	 * @return
	 */
	boolean insertFicket(Ficket ficket); 
	/**
	 * 修改
	 * @param ficket
	 * @return
	 */
	boolean updateFicket(Ficket ficket);
	/**
	 * 删除
	 * @param ids
	 * @return
	 */
	boolean deleteUser(int[] ids);
	
	Ficket findById(int id);
	
	String total(Ficket ficket);
	List<Ficket> findAll(Ficket ficket);
	/**
	 * 分页
	 * @param page
	 */
	void queryUsers(Page<Ficket> page);
	
	
	
	
	
}
