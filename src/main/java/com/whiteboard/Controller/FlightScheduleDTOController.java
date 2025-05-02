package com.whiteboard.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.whiteboard.Repositories.FlightScheduleDTORepository;
import com.whiteboard.Service.FlightScheduleDTOService;

@RestController
@RequestMapping("/flight")
public class FlightScheduleDTOController {

	@Autowired
	FlightScheduleDTORepository flightRepo;
	@Autowired
	FlightScheduleDTOService flightService;

	
	@GetMapping("/timetable")
	public List<Object> getTimetable(@RequestParam String iataCode, @RequestParam String type) {
		System.out.println(">>> Controller HIT");
		return flightService.getTimetable(iataCode, type);
	}

	}
