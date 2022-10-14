package com.puhu.spring.service;

import java.util.List;

import com.puhu.spring.domain.ItemDTO;

public interface ItemService {
	public List<ItemDTO> selectItem();
	public ItemDTO selectOne(Integer itemid);
}
