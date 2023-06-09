package com.lcwd.hotel.services;

import java.util.List;

import com.lcwd.hotel.entities.Hotel;

public interface HotelServices {

	
	
	
	//create 
	Hotel create(Hotel hotel);
	
	//getAll
	
	List<Hotel> getAll();
	
	
	//getID
	Hotel Get(String id);
}
