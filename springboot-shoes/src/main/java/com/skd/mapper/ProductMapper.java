package com.skd.mapper;

import java.util.List;

import com.skd.pojo.Product;

public interface ProductMapper {
	
	void insert(Product product);
	
	List<Product> selectAll();
	
	void update(Product product);
	
	Product edit(int id);

	void delete(int id);
	
	List<Product> selectBycid(int cid);

}
