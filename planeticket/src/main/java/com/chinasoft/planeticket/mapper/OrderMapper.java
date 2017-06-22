package com.chinasoft.planeticket.mapper;

import java.util.List;

import com.chinasoft.planeticket.pojo.OrderPojo;
import com.chinasoft.planeticket.pojo.Page;

public interface OrderMapper {
	
	
	OrderPojo queryOrderPojo(OrderPojo orderPojo);
	/**
	 * 添加
	 * @param ficket
	 * @return
	 */
	boolean insertOrderPojo(OrderPojo orderPojo); 
	/**
	 * 修改
	 * @param ficket
	 * @return
	 */
	boolean updateOrderPojo(OrderPojo orderPojo);
	/**
	 * 删除
	 * @param ids
	 * @return
	 */
	boolean deleteUser(int[] ids);
	
	OrderPojo findById(int id);
	
	String total(OrderPojo orderPojo);
	List<OrderPojo> findAll(OrderPojo orderPojo);

	List<OrderPojo> queryUsers(Page<OrderPojo> page);
	int queryCount(Page<OrderPojo> page);
}
