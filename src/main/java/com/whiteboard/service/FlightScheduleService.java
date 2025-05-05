
package com.whiteboard.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.whiteboard.client.FlightScheduleApiClient;
import com.whiteboard.repositories.FlightScheduleRepository;

//	Translator / mapper

@Service
public class FlightScheduleService {

	@Autowired
	private FlightScheduleApiClient flightApiClient;
	
	@Autowired
	private FlightScheduleRepository flightRepo;

	public List<Object> getTimetable(String iataCode, String type) {
		return flightApiClient.getTimetable(iataCode, type);
	}

}
