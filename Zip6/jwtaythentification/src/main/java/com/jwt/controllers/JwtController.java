package com.jwt.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jwt.helper.JwtUtil;
import com.jwt.model.JwtRequest;
import com.jwt.services.CustomUserDetailsSevice;

@RestController
public class JwtController {

	@Autowired
	private AuthenticationManager authenticationmanager;

	@Autowired
	private CustomUserDetailsSevice customeruserdetails;
	
	@Autowired
	private JwtUtil jwtutil;
	
	@RequestMapping(value="/token",method=RequestMethod.POST)
	public ResponseEntity<?> generateToken(@RequestBody JwtRequest jwtrequest) throws Exception{
		System.out.println(jwtrequest);
		try {
			this.authenticationmanager.authenticate(new UsernamePasswordAuthenticationToken(jwtrequest.getUsername(),jwtrequest.getPassword()));
		}catch(UsernameNotFoundException e) {
			e.printStackTrace();
			throw new Exception("Bad Credentials");
		}
		
		
		
		UserDetails userdetails=this.customeruserdetails.loadUserByUsername(jwtrequest.getUsername());
		
		this.jwtutil.generateToken();
	}
}
