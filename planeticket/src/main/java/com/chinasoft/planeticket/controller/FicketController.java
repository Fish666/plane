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

import com.chinasoft.planeticket.pojo.Ficket;
import com.chinasoft.planeticket.service.IFicketService;

import net.sf.json.JSONObject;

@Controller
@RequestMapping("/view")
public class FicketController {
	@Resource
	private IFicketService iFicketService;
	
	/**
	 * 首页
	 * @param session
	 * @param ficket
	 * @return
	 */
	@RequestMapping("/toCenter")
	public String toCenter(HttpSession session,Ficket ficket){
		String uString=(String) session.getAttribute("uString");
			System.out.println("==="+uString);
		return "FicketViewMain";
	}
	
	@RequestMapping("/getLogin")
	public String getLogin(int id,HttpServletRequest request,Model model){
		request.setAttribute("ficket", iFicketService.findById(id));
		model.addAttribute("ficket",iFicketService.findById(id));
		return null;
		
	}
	
	
	
	
	/**
	 * 查询所有机票
	 * @param queryFicket
	 * @return
	 */
	@RequestMapping("/getAllFikets")
	@ResponseBody
	public Map getAllFikets(Ficket queryFicket){
		List<Ficket> fickets=iFicketService.findAll(queryFicket);
		for(Ficket ficket : fickets){
			System.out.println(ficket.toString());
		}
		String total=iFicketService.total(queryFicket);
		Map map=new HashMap<String,Object>();
		map.put("rows", fickets);
		map.put("total", total);
		return map;
		
		
	}
	
	/**
	 * 添加机票
	 * @param ficket
	 * @return
	 */
	/*@RequestMapping("/insertTesr")
	@ResponseBody
	public boolean insertTest(Ficket ficket){
	boolean add=iFicketService.insertFicket(ficket);
	      return add;
	} */    
	        
	        
	@RequestMapping("/insertFicket")
	@ResponseBody
	public JSONObject insertFicket(Ficket ficket){
		JSONObject insert=new JSONObject();
		 System.out.println("添加"+ficket.toString());
		if (iFicketService.insertFicket(ficket)) {
			insert.put("status", 1);
			insert.put("tip", "添加成功");
		}else {
			insert.put("status", 0);
			insert.put("tip", "添加失败");
		}
		return insert;
	} 
	/**
	 * 删除机票
	 * @param ids
	 * @return
	 */
	@RequestMapping("/deleteFicket")
	@ResponseBody
	public JSONObject deleteFicket(String ids){
		JSONObject json=new JSONObject();
		System.out.println(ids);
		if (iFicketService.deleteFicket(ids)) {
			json.put("status", 1);
			json.put("tip", "删除成功");
		}else {
			json.put("status", 0);
			json.put("tip", "删除失败");
		}
		return json;
	}
	/**
	 * 修改机票
	 * @param ficket
	 * @return
	 */
	@RequestMapping("/updateFicket")
	@ResponseBody
	public JSONObject updateFicket(Ficket ficket){
		JSONObject json=new JSONObject();
		System.out.println(ficket);
		if (iFicketService.updateFicket(ficket)) {
			json.put("status", 1);
			json.put("tip", "修改成功");
		}else {
			json.put("status", 0);
			json.put("tip", "修改失败");
		}
		return json;
		
	}
	
}
