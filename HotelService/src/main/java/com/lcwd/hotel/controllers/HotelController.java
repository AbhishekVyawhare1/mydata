package com.lcwd.hotel.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lcwd.hotel.entities.Hotel;
import com.lcwd.hotel.services.HotelServices;

@RestController
@RequestMapping("/hotels")
public class HotelController {

	@Autowired
	private HotelServices hotss;

	// create
	@PostMapping
	public ResponseEntity<Hotel> createHotel(@RequestBody Hotel hotel) {

		return ResponseEntity.status(HttpStatus.CREATED).body(hotss.create(hotel));
	}

	// getAll
	@GetMapping
	public ResponseEntity<List<Hotel>> GetHotel() {
		return ResponseEntity.status(HttpStatus.OK).body(hotss.getAll());
	}

	// getById
	@GetMapping("/{id}")
	public ResponseEntity<Hotel> GetHotel(@PathVariable String id) {
		return ResponseEntity.status(HttpStatus.OK).body(hotss.Get(id));
	}
}
