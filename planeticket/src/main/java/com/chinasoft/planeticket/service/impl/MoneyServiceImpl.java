package com.chinasoft.planeticket.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import com.chinasoft.planeticket.mapper.MoneyMapper;
import com.chinasoft.planeticket.pojo.Money;
import com.chinasoft.planeticket.pojo.Page;
import com.chinasoft.planeticket.service.IMoneyService;

@Service("moneyService")
public class MoneyServiceImpl implements IMoneyService{
	@Resource 
	private MoneyMapper  moneyMapper;

	@Override
	public void queryMoney(Page<Money> page) {
		// TODO Auto-generated method stub
		List<Money> list=moneyMapper.queryMoney(page);
		int total=moneyMapper.queryCount(page);
		page.setRows(list);
		page.setTotal(total);
	}

	@Override
	public boolean addMoney(Money money) {
		// TODO Auto-generated method stub
		int rows=moneyMapper.addMoney(money);
		if(rows>0)
			return true;
		return false;
	}

	@Override
	public boolean deleteMoney(int[] ids) {
		// TODO Auto-generated method stub
		int rows=moneyMapper.deleteMoney(ids);
		if(rows>0)
			return true;
		return false;
	}

	@Override
	public boolean updateMoney(Money money) {
		// TODO Auto-generated method stub
		int rows=moneyMapper.updateMoney(money);
		if(rows>0)
			return true;
		return false;
	}

		
}