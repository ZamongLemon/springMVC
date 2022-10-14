package com.puhu.spring.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.puhu.spring.domain.ItemDTO;
import com.puhu.spring.service.ItemService;

@RestController
public class ItemRestController {

	@Autowired
	private ItemService itemService;
	
//	@RequestMapping(value="list.json",method=RequestMethod.GET)
//	public List<ItemDTO> getAll(){
//		List<ItemDTO> list = itemService.selectItem();
//		return list;
//		
//	}
	
	@RequestMapping(value="list.json",method=RequestMethod.GET)
	public Map<String,Object> getAll(){
		List<ItemDTO> list = itemService.selectItem();
		Map<String,Object> map = new HashMap<>();
		map.put("result", true);
		map.put("data", list);
		return map;
		
	}
	
	@RequestMapping(value="{itemid}/item.json",method=RequestMethod.GET)
	public ItemDTO selectOne(@PathVariable("itemid") Integer itemid) {		
		ItemDTO a = itemService.selectOne(itemid);
		return a;
	}
}
