package com.jwt.services;

import java.util.ArrayList;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public  class CustomUserDetailsSevice implements UserDetailsService{

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
	
		if(username.equals("Abhishek")) {
			return new User("Abhishek","12345",new ArrayList<>());
		}else {
			throw new UsernameNotFoundException("User Not Found Here Change it");
		}
	}

}
