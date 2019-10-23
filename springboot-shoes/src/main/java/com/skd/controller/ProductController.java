package com.skd.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.skd.pojo.Product;
import com.skd.service.ProductService;


@Controller
public class ProductController {
	@Autowired
	private ProductService productService;
	
	
	@RequestMapping("/addproduct-view")
	public String jump(Product product){
		return "/product-view";
	}
	
	@RequestMapping("/addproduct")
	public String insert(Product product){
		productService.insert(product);
		return "redirect:/show";
	}
	
	@RequestMapping("/show")
	public String show(Model model){
		List<Product> list = productService.selectAll();
		model.addAttribute("list", list);
		return "/admin/listProduct";
	}
	
	@RequestMapping("/editProduct")
	public String edit(int id,Model model){
		Product product = productService.edit(id);
		model.addAttribute("product",product);
		System.out.println(product);
		return "/editProduct-view";
	}
	
	@RequestMapping("/updateProduct")
	public String update(Product product){
		System.out.println(product.getCid());
		productService.update(product);
		return "redirect:/show";
	}
	
	@RequestMapping("/deleteProduct")
	public String delete(int id){
		productService.delete(id);
		return "redirect:/show";
	}

}
