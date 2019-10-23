package com.skd.service.impl;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.skd.mapper.UserMapper;
import com.skd.pojo.User;
import com.skd.service.UserService;

@Service
@Transactional
public class UserServiceImpl implements UserService {
	
	@Resource
	UserMapper userMapper;

	@Override
	public void insert(User user) {
		
		userMapper.insert(user);
		
	}

	@Override
	public User login(User user) {
		
		return userMapper.login(user);
	}

}
