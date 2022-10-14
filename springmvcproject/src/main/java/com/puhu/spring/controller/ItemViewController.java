package com.puhu.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.puhu.spring.domain.ItemDTO;
import com.puhu.spring.service.ItemService;
@Controller
public class ItemViewController {
	
	@Autowired
	private ItemService itemService;
	
	@RequestMapping(value="getitems",method=RequestMethod.GET)
	public String getItems(Model m ){
		
		//필요한 서비스 메소드 호출
		List<ItemDTO> list = itemService.selectItem();
		m.addAttribute("list",list);
		return "items";
	}
	
//	@RequestMapping(value="selectone",method=RequestMethod.GET)
//	public String selectOne(Model m ,@RequestParam("itemid") Integer itemid){
//		
//		//필요한 서비스 메소드 호출
//		ItemDTO data = itemService.selectOne(itemid);
//		m.addAttribute("data",data);
//		return "itemview";
//	}
	
	@RequestMapping(value="selectone/{itemid}",method=RequestMethod.GET)
	public String selectOne(Model m ,@PathVariable Integer itemid){
		
		//필요한 서비스 메소드 호출
		ItemDTO data = itemService.selectOne(itemid);
		m.addAttribute("data",data);
		return "itemview";
	}
}
