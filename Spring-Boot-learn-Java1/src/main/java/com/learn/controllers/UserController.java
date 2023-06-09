package com.learn.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.learn.Repository.UserRepository;
import com.learn.model.User;

@RestController
public class UserController {

	@Autowired
	private UserRepository repo;

	@PostMapping("/get")
	public String Addelement(@RequestBody User user) {
		repo.save(user);
		return "Added Element";
	}
	@GetMapping("/add")
	public List<User> GetElement() {
		return repo.findAll();

	}

	
	@DeleteMapping("/del/{username}")
	public String Nikalo(@PathVariable String username) {
		repo.deleteByUsername(username);
		return "Nikalo Successfully";
	}
	
	@PutMapping("/update/{username}")
	public String UpdateElement(@RequestBody User user,@PathVariable String username) {
		repo.save(user);
		return "Updated SuccessFullY";
	}
}
