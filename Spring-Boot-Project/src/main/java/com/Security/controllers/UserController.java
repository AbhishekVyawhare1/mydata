package com.Security.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Security.Repository.UserRepository;
import com.Security.entites.User;

@RestController
//@RequestMapping("/users")
public class UserController {

	@Autowired
	private UserRepository repo;

	@GetMapping("/gettt")
	public List<User> getData() {
		return repo.findAll();
	}

	@PostMapping("/ss")
	public String PostData(@RequestBody User user) {
		repo.save(user);
		return "Added SuccessFuly";
	}

	@DeleteMapping("/del/{username}")
	public String Nikalo(@PathVariable String username) {
		repo.deleteByUsername(username);
		return "Nikalo Successfully";
	}

	@PutMapping("/put/{username}")
	public String Putdata(@RequestBody User user, @PathVariable String username) {
		repo.save(user);
		return "Put SuccessFully" + user.getUsername();
	}
}
