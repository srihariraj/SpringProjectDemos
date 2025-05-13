package com.example.demo.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpecialConfig {
	
	@Bean
	String printer() {
		return "bean created for printer";
	}
}
