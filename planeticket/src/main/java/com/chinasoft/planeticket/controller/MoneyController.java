package com.chinasoft.planeticket.controller;


import javax.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.chinasoft.planeticket.pojo.Money;
import com.chinasoft.planeticket.pojo.Page;
import com.chinasoft.planeticket.service.IMoneyService;
import net.sf.json.JSONObject;

@Controller
@RequestMapping("/money")
public class MoneyController {
	@Resource
	private IMoneyService moneyService;
	
	 
	@RequestMapping("/queryMoney")
	@ResponseBody
	public Page<Money> queryMoney(Money money,Integer curPage,Integer pageSize){
		Page<Money> page=new Page<Money>();
		page.setQuery(money);
		if(curPage!=null)
			page.setCurPage(curPage);
		if(pageSize!=null)
			page.setPageSize(pageSize);
		
		moneyService.queryMoney(page);
		
		return page;
	}
	
	@RequestMapping("/addMoney")
	@ResponseBody
	public JSONObject addMoney(Money money){
		JSONObject insert=new JSONObject();
		if(moneyService.addMoney(money)){
			insert.put("status", 1);
			insert.put("tip", "添加成功");
		}else {
			insert.put("status", 0);
			insert.put("tip", "添加失败");
		}
		return insert;			
	}
	@RequestMapping("/deleteMoney")
	@ResponseBody
	public JSONObject deleteMoney(int[] ids){
		JSONObject delete=new JSONObject();
		if(moneyService.deleteMoney(ids)){
			delete.put("status", 1);
			delete.put("tip", "删除成功");
		}else {
			delete.put("status", 0);
			delete.put("tip", "删除失败");
		}
		return delete;
	}
	@RequestMapping("/updateMoney")
	@ResponseBody
	public JSONObject updateMoney(Money money){
		JSONObject update=new JSONObject();
		if(moneyService.updateMoney(money)){
			update.put("status", 1);
			update.put("tip", "修改成功");
		}else {
			update.put("status", 0);
			update.put("tip", "修改失败");
		}
		return update;
	}
	
}