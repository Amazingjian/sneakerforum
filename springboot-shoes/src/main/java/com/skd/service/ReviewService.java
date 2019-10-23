package com.skd.service;

import java.util.List;

import com.skd.pojo.Review;

public interface ReviewService {
	
	void insert(Review review);
	
	List<Review> list(int pid);

}
