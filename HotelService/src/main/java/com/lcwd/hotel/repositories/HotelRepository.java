package com.lcwd.hotel.repositories;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.lcwd.hotel.entities.Hotel;

public interface HotelRepository extends MongoRepository<Hotel, String>{

	Optional<Hotel> findById(String id);

}
