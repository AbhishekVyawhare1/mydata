package com.learn1.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
public class MySecurityConfig extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
		.authorizeRequests()
//		.antMatchers("/home","/login","/register").permitAll()
		.antMatchers("/public/**").permitAll()
		.anyRequest()
		.authenticated()
		.and()
		.httpBasic();
	}

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication().withUser("john").password(this.paswordEncoder().encode("abhi")).roles("NORMAL");
		auth.inMemoryAuthentication().withUser("roshni").password(this.paswordEncoder().encode("abc")).roles("ADMIN");
	}

	
	
	
	//Role-High level overview ->Normal :Read
	//Authority->Permission to Read\
	//ADMIN->READ,WRITE,UPDATE
	@Bean
	public PasswordEncoder paswordEncoder() {

		return new BCryptPasswordEncoder(11);
	}
}
