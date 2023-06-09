package com.lcwd.hotel.Imp;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lcwd.hotel.entities.Hotel;
import com.lcwd.hotel.exceptions.ResourceNotFoundException;
import com.lcwd.hotel.repositories.HotelRepository;
import com.lcwd.hotel.services.HotelServices;

@Service
public class HotelServiceImpl implements HotelServices {

	@Autowired
	private HotelRepository repos;

	@Override
	public Hotel create(Hotel hotel) {

		
		String hotelId = UUID.randomUUID().toString();
		hotel.setId(hotelId);
		return repos.save(hotel);
	}

	@Override
	public List<Hotel> getAll() {
		return repos.findAll();

	}

	@Override
	public Hotel Get(String id) {
		return repos.findById(id).orElseThrow(() -> new ResourceNotFoundException("given hotels id not found!!"));
	}

}
