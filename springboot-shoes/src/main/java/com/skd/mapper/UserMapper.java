package com.skd.mapper;

import com.skd.pojo.User;

public interface UserMapper {
	
    void insert(User user);
    
    User login(User user);
    
    User getUserByname(User user);

}
