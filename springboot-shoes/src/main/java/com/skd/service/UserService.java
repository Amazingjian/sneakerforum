package com.skd.service;

import com.skd.pojo.User;

public interface UserService {
	
   void	insert(User user) ;
   
   User login(User user);

}
