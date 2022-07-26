package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class ProfileController {
	
	@Value("${spring.profile.message}")

	private String msg;
	
	@GetMapping(value = "/demo")
	public String demoprofile() {
		return msg;
	}
	

}
