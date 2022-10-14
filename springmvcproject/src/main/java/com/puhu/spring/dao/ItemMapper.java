package com.puhu.spring.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import com.puhu.spring.domain.ItemDTO;

@Repository
public interface ItemMapper {
	@Select("select * from item")
	public List<ItemDTO> selectItem();
	
	@Select("select * from item where itemid = #{itemid}")
	public ItemDTO selectOne(Integer itemid);
}


