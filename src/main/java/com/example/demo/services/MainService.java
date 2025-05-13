package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.demo.configurations.SpecialConfig;

@Service
public class MainService {

	@Autowired
	@Qualifier("printer")
	SpecialConfig config;
	public void print() {
		
	}
	
}
