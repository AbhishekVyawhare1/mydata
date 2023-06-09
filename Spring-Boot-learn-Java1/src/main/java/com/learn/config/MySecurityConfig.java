package com.learn.config;

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
		http.csrf().disable()
			.authorizeRequests()
				.antMatchers("/get").hasAnyRole("EMPLOYEE", "ADMIN") // Allows access to /add for both EMPLOYEE and ADMIN roles
				.antMatchers("/add").hasRole("ADMIN") // Allows access to /get only for EMPLOYEE role
				.antMatchers("/del/**").hasRole("ADMIN") // Allows access to /del/** only for ADMIN role
				.antMatchers("/update/**").hasRole("ADMIN") // Allows access to /update/** only for ADMIN role
				.anyRequest().authenticated()
			.and()
			.httpBasic();
	}

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication().withUser("Abhishek").password(this.passwordEncoder().encode("123")).roles("Employee");
		auth.inMemoryAuthentication().withUser("Avneet").password(this.passwordEncoder().encode("123")).roles("Admin");
	}
	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder(11);
	}
}
