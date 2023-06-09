package com.jwt.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.jwt.services.CustomUserDetailsSevice;

@Configuration
@EnableWebSecurity
public class MySecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	private CustomUserDetailsSevice customuserdetailsservice;
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http	
		        .csrf()
		        .disable()
		        .cors()
		        .disable()
		        .authorizeRequests()
		        .antMatchers("/token").permitAll()
		        .anyRequest().authenticated()
		        .and()
		        .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
	}	

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(customuserdetailsservice);
	}
	
	
	@Bean
	public PasswordEncoder passwordincoder() {
		return NoOpPasswordEncoder.getInstance();
	}

}
