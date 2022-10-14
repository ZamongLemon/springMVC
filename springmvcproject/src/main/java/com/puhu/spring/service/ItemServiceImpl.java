package com.puhu.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.puhu.spring.dao.ItemMapper;
import com.puhu.spring.dao.ItemRepository;
import com.puhu.spring.domain.ItemDTO;

@Service
public class ItemServiceImpl implements ItemService{
	@Autowired
	private ItemMapper itemMapper;
	
	public List<ItemDTO> selectItem(){
		return itemMapper.selectItem();
	};
	public ItemDTO selectOne(Integer itemid) {
		return itemMapper.selectOne(itemid);
	}
}
