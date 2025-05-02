package com.whiteboard.Client;


import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.whiteboard.Config.FlightApiProperties;


@Component
public class FlightScheduleDTOApiClient {

	private final RestTemplate restTemplate;
	private final FlightApiProperties apiProps;

	@Autowired
	public FlightScheduleDTOApiClient(RestTemplate restTemplate, FlightApiProperties apiProps) {

		this.restTemplate = restTemplate;
		this.apiProps = apiProps;

	}

	public List<Object> getTimetable(String iataCode, String type) {
		String paramKey = type.equalsIgnoreCase("arrival") ? "arrIata" : "depIata";
		String endpoint = "/timetable";
		String url = apiProps.getUrl() + endpoint + "?key=" + apiProps.getKey() + "&" + paramKey
				+ "=" + iataCode;

		System.out.println("Calling URL: " + url);
		ResponseEntity<Object[]> response = restTemplate.getForEntity(url, Object[].class);
		return Arrays.asList(response.getBody());
	}


}
