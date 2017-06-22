package com.chinasoft.planeticket.mapper;

import java.util.List;

import com.chinasoft.planeticket.pojo.Money;
import com.chinasoft.planeticket.pojo.Page;

public interface MoneyMapper {
	List<Money> queryMoney(Page<Money> page);
	int queryCount(Page<Money> page);
	int addMoney(Money money);
	int deleteMoney(int[] ids);
	int updateMoney(Money money);
}
