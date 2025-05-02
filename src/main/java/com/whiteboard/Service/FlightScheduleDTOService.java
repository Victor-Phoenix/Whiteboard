
package com.whiteboard.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.whiteboard.Client.FlightScheduleDTOApiClient;
import com.whiteboard.Repositories.FlightScheduleDTORepository;

@Service
public class FlightScheduleDTOService {

	@Autowired
	private FlightScheduleDTOApiClient flightApiClient;
	
	@Autowired
	private FlightScheduleDTORepository flightRepo;

	public List<Object> getTimetable(String iataCode, String type) {
		return flightApiClient.getTimetable(iataCode, type);
	}
}
