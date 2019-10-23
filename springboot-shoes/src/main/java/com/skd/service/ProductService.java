package com.skd.service;

import java.util.List;

import com.skd.pojo.Product;


public interface ProductService {
	
   void	insert(Product product) ;
   
   List<Product> selectAll();
   
   void update(Product product);
   
   Product edit(int id);

    void delete(int id);
    
    List<Product> selectBycid(int cid);

}
