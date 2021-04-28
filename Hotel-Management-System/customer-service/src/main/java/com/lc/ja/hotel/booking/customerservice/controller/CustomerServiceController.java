package com.lc.ja.hotel.booking.customerservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerServiceController {

	@GetMapping("/")
	public String home() {
		return "Welcome to Customer Service";
	}

	@GetMapping("/sayHello/{name}")
	public String sayHello(@PathVariable("name") String name) {
		return "Welcome to  " + name + " , This is the Customer Service";
	}
	
}
