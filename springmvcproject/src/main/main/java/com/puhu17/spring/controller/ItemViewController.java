package com.puhu17.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.puhu17.spring.domain.ItemDTO;
import com.puhu17.spring.service.ItemService;
@Controller
public class ItemViewController {

	@Autowired
	private ItemService itemService;
	
	@RequestMapping(value="getitems",method=RequestMethod.GET)
	public String getItems(){
		System.out.println("??");
		//필요한 서비스 메소드 호출
		List<ItemDTO> list = itemService.selectItem();
		System.out.println(list);
		
		return "items";
	}
}
