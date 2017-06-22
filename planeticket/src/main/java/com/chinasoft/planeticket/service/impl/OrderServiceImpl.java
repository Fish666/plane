package com.chinasoft.planeticket.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.chinasoft.planeticket.mapper.OrderMapper;
import com.chinasoft.planeticket.pojo.Ficket;
import com.chinasoft.planeticket.pojo.OrderPojo;
import com.chinasoft.planeticket.pojo.Page;
import com.chinasoft.planeticket.service.IOrderService;

@Service("orderService")
public class OrderServiceImpl implements IOrderService{
	@Resource 
	private OrderMapper orderMapper;

	@Override
	public OrderPojo queryOrderPojo(OrderPojo orderPojo) {
		// TODO Auto-generated method stub
		return orderMapper.queryOrderPojo(orderPojo);
	}

	@Override
	public boolean insertOrderPojo(OrderPojo orderPojo) {
		// TODO Auto-generated method stub
		return orderMapper.insertOrderPojo(orderPojo);
	}

	@Override
	public boolean updateOrderPojo(OrderPojo orderPojo) {
		// TODO Auto-generated method stub
		return orderMapper.updateOrderPojo(orderPojo);
	}

	@Override
	public boolean deleteUser(int[] ids) {
		// TODO Auto-generated method stub
		return orderMapper.deleteUser(ids);
	}

	@Override
	public OrderPojo findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String total(OrderPojo orderPojo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<OrderPojo> findAll(OrderPojo orderPojo) {
		// TODO Auto-generated method stub
		return orderMapper.findAll(orderPojo);
	}

	@Override
	public void queryUsers(Page<OrderPojo> page) {
		// TODO Auto-generated method stub
		List<OrderPojo> list=orderMapper.queryUsers(page);
		int total=orderMapper.queryCount(page);
		page.setRows(list);
		page.setTotal(total);
		
		
	}
	


}
