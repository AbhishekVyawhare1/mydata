package com.lcwd.rating.RatingService.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lcwd.rating.RatingService.entities.Rating;
import com.lcwd.rating.RatingService.repository.RatingRepo;
import com.lcwd.rating.RatingService.services.RatingService;

@Service

public class RatingServiceImpl implements RatingService {

	@Autowired
	private RatingRepo repos;

	@Override
	public Rating create(Rating rating) {
		return repos.save(rating);
	}

	@Override
	public List<Rating> getRatings() {
		return repos.findAll();
	}

	@Override
	public List<Rating> getRatingByUserId(String userId) {
		return repos.findByUserId(userId);

	}

	@Override
	public List<Rating> getRatingByHotelId(String hotelId) {
		return repos.findByHotelId(hotelId);

	}

}
