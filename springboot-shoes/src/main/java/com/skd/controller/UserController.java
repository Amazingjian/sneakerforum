package com.skd.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.skd.pojo.User;
import com.skd.service.UserService;

@Controller
public class UserController {
	@Autowired
	private UserService userService;
	
	@RequestMapping("/register")
	public String jump(){
		return "/register";
	}
	
	@RequestMapping("/login")
	public String login(User user){

		return "/login-view";
	}
	
	@RequestMapping("addUser")
	public String insert(User user){
		userService.insert(user);
		return "redirect:/userlogin";
	}
	


}
