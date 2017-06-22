package com.chinasoft.planeticket.controller;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.chinasoft.planeticket.pojo.OrderPojo;
import com.chinasoft.planeticket.service.IOrderService;

import net.sf.json.JSONObject;



@Controller
@RequestMapping("/order")
public class OrderController {
	@Resource
	private IOrderService iOrderService;
	
	/**
	 * 首页
	 * @param session
	 * @param ficket
	 * @return
	 */
	@RequestMapping("/toOrder")
	public String toCenter(HttpSession session,OrderPojo ficket){
		String uString=(String) session.getAttribute("uString");
			System.out.println("==="+uString);
		return "FicketViewMain";
	}
	
	@RequestMapping("/getint")
	public String getLogin(int id,HttpServletRequest request,Model model){
		request.setAttribute("ficket", iOrderService.findById(id));
		model.addAttribute("ficket",iOrderService.findById(id));
		return null;
	}	
	
	@RequestMapping("/getAllOrder")
	@ResponseBody
	public Map getAllOrder(OrderPojo getAllOrder){
		List<OrderPojo> fList=iOrderService.findAll(getAllOrder);
		for(OrderPojo orderPojo : fList){
			System.out.println(orderPojo.toString());
		}
		String total=iOrderService.total(getAllOrder);
		Map map=new HashMap<String,Object>();
		map.put("rows", fList);
		map.put("total",total);
 		return map;
	}
	
	@RequestMapping("/insertOrderPojo")
	@ResponseBody
	public JSONObject insertOrderPojo(OrderPojo orderPojo){
		JSONObject insert=new JSONObject();
		 System.out.println("添加"+orderPojo.toString());
		if (iOrderService.insertOrderPojo(orderPojo)) {
			insert.put("status", 1);
			insert.put("tip", "添加成功");
		}else {
			insert.put("status", 0);
			insert.put("tip", "添加失败");
		}
		return insert;
	}
	
	@RequestMapping("/deleteOrderPojo")
	@ResponseBody
	public JSONObject deleteOrderPojo(int[] ids){
		JSONObject json=new JSONObject();
		System.out.println(ids);
		if (iOrderService.deleteUser(ids)) {
			json.put("status", 1);
			json.put("tip", "删除成功");
		}else {
			json.put("status", 0);
			json.put("tip", "删除失败");
		}
		return json;
	}
	
	
	@RequestMapping("/updateOrderPojo")
	@ResponseBody
	/*public void updateFicket(HttpServletRequest request,Ficket ficket){
			iFicketService.updateFicket(ficket);
	}*/
	public JSONObject updateFicket(OrderPojo orderPojo){
		JSONObject json=new JSONObject();
		System.out.println(orderPojo);
		if (iOrderService.updateOrderPojo(orderPojo)) {
			json.put("status", 1);
			json.put("tip", "修改失败");
		}else {
			json.put("status", 0);
			json.put("tip", "修改成功");
		}
		return json;
		
	}
}
