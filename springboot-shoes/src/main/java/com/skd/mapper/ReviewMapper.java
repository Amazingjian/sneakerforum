package com.skd.mapper;

import java.util.List;

import com.skd.pojo.Review;

public interface ReviewMapper {
	
	void insert(Review review);
	
	List<Review> list(int pid);

}
