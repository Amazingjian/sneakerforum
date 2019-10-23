package com.skd.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skd.mapper.ReviewMapper;
import com.skd.pojo.Review;
import com.skd.service.ReviewService;
@Service
public class ReviewServiceImpl implements ReviewService {
	
	@Autowired
	ReviewMapper reviewMapper;

	@Override
	public void insert(Review review) {
		reviewMapper.insert(review);
		
	}

	@Override
	public List<Review> list(int pid) {
		// TODO Auto-generated method stub
		return reviewMapper.list(pid);
	}

}
