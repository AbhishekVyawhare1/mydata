package com.Security.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
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
            .antMatchers(HttpMethod.GET, "/gettt").hasAnyAuthority("Normal", "Admin")
            .antMatchers(HttpMethod.POST, "/ss").hasRole("Admin")
            .antMatchers(HttpMethod.DELETE, "/del/{username}").hasRole("Admin")
            .antMatchers(HttpMethod.PUT, "/put/{username}").hasRole("Admin")
            .anyRequest().authenticated()
            .and()
            .httpBasic()
            .and()
            .csrf().disable()
            .cors();
    }


    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        
    	auth.inMemoryAuthentication()
                .withUser("Abhishek").password(passwordEncoder().encode("@123@")).roles("Normal")
                .and()
                .withUser("Avneet").password(passwordEncoder().encode("@12@")).roles("Admin");
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder(11);
    }
}
