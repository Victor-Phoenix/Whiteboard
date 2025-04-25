package com.whiteboard.Controller;

import com.whiteboard.Models.Agent;
import com.whiteboard.Models.Flight;
import com.whiteboard.Repositories.AgentRepository;
import com.whiteboard.Repositories.FlightRepository;

import jakarta.validation.Valid;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/flight")
public class FlightController {

	@Autowired
	FlightRepository flightRepo;
	
	@PostMapping("/addFlight")
	public void addFlight(Flight flight) {
		System.out.println("Adding flight: ");
		flightRepo.save(flight);
	}
	
	
	@GetMapping("/getFlight")
	public List<Flight> getAllFlights(){
		return flightRepo.findAll();
	}
	
	@GetMapping("/getAgent/{id}")
	public Flight getFlightByID(@PathVariable Long id) {
		return flightRepo.findById(id).orElse(null);
	}
	}
