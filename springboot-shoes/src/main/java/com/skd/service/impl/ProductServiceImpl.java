package com.skd.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.skd.mapper.ProductMapper;
import com.skd.pojo.Product;
import com.skd.service.ProductService;

@Service
@Transactional
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	ProductMapper productMapper;
	
	public void insert(Product product){
		productMapper.insert(product);
	}

	@Autowired
	public List<Product> selectAll() {
		
		return productMapper.selectAll();
	}

	@Override
	public void update(Product product) {
		productMapper.update(product);
		
	}

	@Override
	public Product edit(int id) {
		return productMapper.edit(id);
	}

	@Override
	public void delete(int id) {
		productMapper.delete(id);
		
	}

	@Override
	public List<Product> selectBycid(int cid) {
		// TODO Auto-generated method stub
		return productMapper.selectBycid(cid);
	}

}
