package com.chinasoft.planeticket.service;

import com.chinasoft.planeticket.pojo.Money;
import com.chinasoft.planeticket.pojo.Page;

public interface IMoneyService {
	void queryMoney(Page<Money> page);
	boolean addMoney(Money money);
	boolean deleteMoney(int[] ids);
	boolean updateMoney(Money money);
}
