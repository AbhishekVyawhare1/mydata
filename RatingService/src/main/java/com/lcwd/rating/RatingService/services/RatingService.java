package com.lcwd.rating.RatingService.services;

import java.util.List;

import com.lcwd.rating.RatingService.entities.Rating;


public interface RatingService {

	// create
	Rating create(Rating rating);

	// getAll Ratings
	List<Rating> getRatings();

	// getAllbyuserId
	List<Rating> getRatingByUserId(String userId);
	
	
	
	// getAllbyrating
	List<Rating> getRatingByHotelId(String hotelId);

}
