package com.skd.mapper;

import java.util.List;

import com.skd.pojo.Category;

public interface CategoryMapper {
	
	List<Category> list();
	void add(Category category);
	void delete(int id);
	Category edit(int id);
	void update(Category category);

}
