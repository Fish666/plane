package com.chinasoft.planeticket.mapper;

import java.util.List;

import com.chinasoft.planeticket.pojo.Ficket;
import com.chinasoft.planeticket.pojo.Page;

public interface FicketMapper {
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
	 * @param ficket
	 * @return
	 */
	boolean deleteFicket(String ids);
	
	String total(Ficket ficket);
	
	List<Ficket> findAll(Ficket ficket);
	List<Ficket> queryUsers(Page<Ficket> page);
	int queryCount(Page<Ficket> page);
}
