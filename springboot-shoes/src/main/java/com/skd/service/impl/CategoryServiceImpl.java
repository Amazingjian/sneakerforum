
package com.skd.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skd.mapper.CategoryMapper;
import com.skd.pojo.Category;
import com.skd.service.CategoryService;

import java.util.List;

@Service
public  class CategoryServiceImpl implements CategoryService {
    @Autowired
    CategoryMapper categoryMapper;

	@Override
	public List<Category> list() {
		// TODO Auto-generated method stub
		return categoryMapper.list();
	}

	@Override
	public void add(Category category) {
		categoryMapper.add(category);
		
	}

	@Override
	public void delete(int id) {
		categoryMapper.delete(id);
		
	}

	@Override
	public Category edit(int id) {
		// TODO Auto-generated method stub
		return categoryMapper.edit(id);
	}

	@Override
	public void update(Category category) {
		// TODO Auto-generated method stub
		categoryMapper.update(category);
	}

  
}
/**
* 模仿天猫整站ssm 教程 为how2j.cn 版权所有
* 本教程仅用于学习使用，切勿用于非法用途，由此引起一切后果与本站无关
* 供购买者学习，请勿私自传播，否则自行承担相关法律责任
*/	
