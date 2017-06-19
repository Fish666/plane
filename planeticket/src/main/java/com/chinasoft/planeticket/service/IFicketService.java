package com.chinasoft.planeticket.service;

import java.util.List;

import com.chinasoft.planeticket.pojo.Ficket;

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
	boolean deleteFicket(String ids);
	
	Ficket findById(int id);
	String total(Ficket ficket);
	List<Ficket> findAll(Ficket ficket);
	
}
