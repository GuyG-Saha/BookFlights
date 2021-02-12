package com.javatechie.tx.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.javatechie.tx.dto.FlightBookingBill;
import com.javatechie.tx.dto.FlightBookingRequest;
import com.javatechie.tx.service.FlightBookingService;

@RestController
//@RequestMapping("/api")
public class FlightBookingController {
	
	@Autowired
	private FlightBookingService bookingService;

	//@PostMapping("/bookFlightTicket")
	@RequestMapping(value = "/bookFlightTicket", method = RequestMethod.POST)
	public FlightBookingBill bookFlight(@RequestBody FlightBookingRequest request) {
		return bookingService.BookFlightTicket(request);
	}

}
