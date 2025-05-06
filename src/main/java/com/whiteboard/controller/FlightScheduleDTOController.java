package com.whiteboard.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.whiteboard.repositories.FlightScheduleRepository;
import com.whiteboard.service.FlightScheduleService;

@RestController
@RequestMapping("/api/flight")
public class FlightScheduleDTOController {

	@Autowired
	FlightScheduleRepository flightRepo;
	@Autowired
	FlightScheduleService flightService;

	// This is used to populate information onto the "Whiteboard"
	@GetMapping("/getArrival")
	public List<Object> getArrival() {
	    String iataCode = "YXY"; // hardcoded for now
	    String type = "arrival"; // or "departure" depending on your service
	    System.out.println(">>> Controller HIT");
	    return flightService.getArrival(iataCode);
	}
	
	
//	@GetMapping("/getDeparture")
//	public List<DepartureDTO> getDepartures() { }
//
//	@GetMapping("/getSchedule")
//	public List<FlightScheduleDTO> getSchedule() {
//	    // combine both
//	}
}
