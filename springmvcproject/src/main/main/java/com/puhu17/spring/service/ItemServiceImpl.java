package com.puhu17.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.puhu17.spring.dao.ItemRepository;
import com.puhu17.spring.domain.ItemDTO;

@Service
public class ItemServiceImpl implements ItemService{
	@Autowired
	private ItemRepository itemRepository;
	
	public List<ItemDTO> selectItem(){
		return itemRepository.selectItem();
	};
}
