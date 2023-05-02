package com.in28minutes.rest.webservices.config;
import static org.springframework.security.config.Customizer.withDefaults;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;


@Configuration
public class SecurityConfig  {
 
	@Bean

	public SecurityFilterChain FilterChain(HttpSecurity http) throws Exception
	{
		http.httpBasic( withDefaults());
		http.csrf().disable();

		http.headers().frameOptions().disable();

		http.cors();
		return http.build();



	}
}
