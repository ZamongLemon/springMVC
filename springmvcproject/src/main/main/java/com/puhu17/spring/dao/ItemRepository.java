package com.puhu17.spring.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.puhu17.spring.domain.ItemDTO;


//class에 @Component를 설정하면 servlet-context.xml 파일의 component-scan에 설정된 패키지에 속한경우 bean 생성
//@Repository, @Service, @Controller, @RestController를 기재하면 역할까지 부여 
@Repository
public class ItemRepository {
	
	@Autowired
	private SqlSession sqlSession;
	
	public List<ItemDTO> selectItem(){
		return sqlSession.selectList("itemmapper.getall");
	}
	
}
