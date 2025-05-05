package com.whiteboard.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.whiteboard.repositories.FlightScheduleRepository;
import com.whiteboard.service.FlightScheduleService;

@RestController
@RequestMapping("/flight")
public class FlightScheduleDTOController {

	@Autowired
	FlightScheduleRepository flightRepo;
	@Autowired
	FlightScheduleService flightService;

	// This is used to populate information onto the "Whiteboard"
	@GetMapping("/timetable")
	public List<Object> getTimetable(@RequestParam String iataCode, @RequestParam String type) {
		System.out.println(">>> Controller HIT");
		return flightService.getTimetable(iataCode, type);
	}

}
