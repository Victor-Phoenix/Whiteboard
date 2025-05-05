package com.whiteboard.client;


import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.whiteboard.config.FlightScheduleApiProperties;
//Does all the apis calls	

@Component
public class FlightScheduleApiClient {


	private final RestTemplate restTemplate;
	private final FlightScheduleApiProperties apiProps;

	@Autowired
	public FlightScheduleApiClient(RestTemplate restTemplate,
			FlightScheduleApiProperties apiProps) {

		this.restTemplate = restTemplate;
		this.apiProps = apiProps;

	}

	//
	public List<Object> getArrival(String iataCode, String type) {
		String endpoint = "/timetable";
		String url = apiProps.getUrl() + endpoint + "?key=" + apiProps.getKey() + "&" + "="
				+ iataCode;

		System.out.println("Calling URL: " + url);
		ResponseEntity<Object[]> response = restTemplate.getForEntity(url, Object[].class);
		return Arrays.asList(response.getBody());
	}


}
