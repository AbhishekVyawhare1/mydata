package com.lcwd.user.service.UserService.services.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.lcwd.user.service.UserService.entities.Ratings;
import com.lcwd.user.service.UserService.entities.User;
import com.lcwd.user.service.UserService.exceptions.ResourceNotFoundException;
import com.lcwd.user.service.UserService.repository.UserRepository;
import com.lcwd.user.service.UserService.services.UserService;

import ch.qos.logback.classic.Logger;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private RestTemplate restTemplate;
	
	private Logger logger=(Logger) LoggerFactory.getLogger(UserServiceImpl.class);

	@Override
	public User saveuser(User user) {
		String randomUserId = UUID.randomUUID().toString();
		user.setUserId(randomUserId);
		return userRepository.save(user);

	}

	@Override
	public List<User> getAllUser() {
		return userRepository.findAll();

	}

	@Override
	public User getUser(String userId) {
		// get user database with the hwlp of user Repository
		User user = userRepository.findById(userId)
				.orElseThrow(() -> new ResourceNotFoundException("User wih id is not found on the server!!" + userId));
		// fetch rating of the above user from RATING SERVICE
		// http:localhost:8083/ratings/users/04e35522-7548-4df5-8e4d-2735bf945082
		// http://localhost:8083/ratings/users/f2ebd247-7a5c-476b-b441-ed8298bd4256
		
		
		/*
		 * ArrayList forObject = restTemplate.getForObject(
		 * "http://localhost:8083/ratings/users/f2ebd247-7a5c-476b-b441-ed8298bd4256",
		 * ArrayList.class); logger.info("{} ",forObject);
		 */
		
		ArrayList<Ratings> ratingsofuser = restTemplate.getForObject(
				"http://localhost:8083/ratings/users/"+user.getUserId(), ArrayList.class);
		logger.info("{} ",ratingsofuser);
		user.setRatings(ratingsofuser);
		return user;
	}

	@Override
	public String DeleteUser(String userId) {
		userRepository.deleteById(userId);
		return "Deleted";

	}

}
