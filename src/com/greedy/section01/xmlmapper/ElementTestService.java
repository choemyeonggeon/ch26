package com.greedy.section01.xmlmapper;

import static com.greedy.common.Template.getSqlSession;


import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.greedy.common.CategoryAndMenuDTO;
import com.greedy.common.MenuAndCategoryDTO;
import com.greedy.common.MenuDTO;



public class ElementTestService {
	
	private ElementTestMapper mapper;

	public void selectCacheTest() {
	
		SqlSession sqlSession = getSqlSession();
		mapper = sqlSession.getMapper(ElementTestMapper.class);
		
		for(int i = 0; i < 10; i++) {
			Long startTime = System.currentTimeMillis();
			
			List<String> nameList = mapper.selectCacheTest();
			System.out.println(nameList);
			
			Long endTime = System.currentTimeMillis();
			
			Long interval = endTime - startTime;
			System.out.println("수행 시간 :" + interval + "(ms)");
		}
		sqlSession.close();
	}

	public void selectResultMapTest() {
		SqlSession sqlSession = getSqlSession();
		mapper = sqlSession.getMapper(ElementTestMapper.class);
		
		List<MenuDTO> menuList = mapper.selectResultMapTest();
		for(MenuDTO menu : menuList) {
			System.out.println(menu);
		}
		sqlSession.close();
	}

	public void selectResultMapConstructorTest() {
		SqlSession sqlSession = getSqlSession();
		mapper = sqlSession.getMapper(ElementTestMapper.class);
		
		List<MenuDTO> menuList = mapper.selectResultMapConstructorTest();
		for(MenuDTO menu : menuList) {
			System.out.println(menu);
		}
		sqlSession.close();
	}

	public void selectResultMapAssociationTest() {
		SqlSession sqlSession = getSqlSession();
		mapper = sqlSession.getMapper(ElementTestMapper.class);
		
		List<MenuAndCategoryDTO> menuList = mapper.selectResultMapAssociationTest();
		for(MenuAndCategoryDTO menu : menuList) {
			System.out.println(menu);
			
		}
		
	}

	public void selectResultMapCollectionTest() {
		
		SqlSession sqlSession = getSqlSession();
		mapper = sqlSession.getMapper(ElementTestMapper.class);
		
		List<CategoryAndMenuDTO> categoryList = mapper.selectResultMapCollectionTest();
		for(CategoryAndMenuDTO category : categoryList) {
			System.out.println(category);
		}
		
		sqlSession.close();
	}
	
	public void selectSqlTest() {
		SqlSession sqlSession = getSqlSession();
		mapper = sqlSession.getMapper(ElementTestMapper.class);
		
		List<MenuDTO> menuList = mapper.selectSqlTest();
		for(MenuDTO menu : menuList) {
			System.out.println(menu);
		}
		
		sqlSession.close();
	
	}

	public void insertMenuTest(MenuDTO menu) {
		
		SqlSession sqlSession = getSqlSession();
		mapper = sqlSession.getMapper(ElementTestMapper.class);
		
		int result = mapper.insertMenuTest(menu);
		
		if(result > 0) {
			System.out.println("메뉴 등록 성공!");
			sqlSession.commit();
		} else {
			System.out.println("메뉴 등록 실패!");
			sqlSession.rollback();
		}
		
		sqlSession.close();
	}

		
	

	public void insertCategoryAndMenuTest(MenuAndCategoryDTO menuAndCategory) {
		
		SqlSession sqlSession = getSqlSession();
		mapper = sqlSession.getMapper(ElementTestMapper.class);
		
		int result1 = mapper.insertNewCategory(menuAndCategory);
		int result2 = mapper.insertNewMenu(menuAndCategory);
		
		if(result1 > 0 && result2 > 0) {
			System.out.println("신규 카테고리와 메뉴 등록 성공!");
			sqlSession.commit();
		} else {
			System.out.println("신규 카테고리와 메뉴 등록 실패!");
			sqlSession.rollback();
		}
		
		sqlSession.close();
	}
}
