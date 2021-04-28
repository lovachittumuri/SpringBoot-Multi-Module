package com.lc.ja.hotel.booking.bookingservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookingServiceController {

	@GetMapping("/")
	public String home() {
		return "Welcome to Booking Service";
	}

	@GetMapping("/booking/{name}")
	public String sayWishes(@PathVariable("name") String name) {
		return "Welcome to  " + name + " , This is the Booking Service";
	}
}
