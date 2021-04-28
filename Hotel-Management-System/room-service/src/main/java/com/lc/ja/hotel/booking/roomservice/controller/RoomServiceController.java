package com.lc.ja.hotel.booking.roomservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RoomServiceController {


	@GetMapping("/")
	public String home() {
		return "Welcome to RoomService";
	}

	@GetMapping("/wish/{name}")
	public String sayWishes(@PathVariable("name") String name) {
		return "Welcome to  " + name + " , This is the Room Service";
	}

	
	
}
