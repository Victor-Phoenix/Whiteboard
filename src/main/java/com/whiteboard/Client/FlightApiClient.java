package com.whiteboard.Client;


import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.whiteboard.Config.FlightApiProperties;


@Component
public class FlightApiClient {

	private final RestTemplate restTemplate;
	private final FlightApiProperties apiProps;

	@Autowired
	public FlightApiClient(RestTemplate restTemplate, FlightApiProperties apiProps) {

		this.restTemplate = restTemplate;
		this.apiProps = apiProps;

	}

	public List<Object> getFlightsByDeparture(String depIata) {
		String endpoint = "/flights";
		String url = apiProps.getUrl() + endpoint + "?key" + apiProps.getKey() + "&depIata"
				+ depIata;

		ResponseEntity<Object[]> response = restTemplate.getForEntity(url, Object[].class);
		return Arrays.asList(response.getBody());
	}

//	public List<Object> getFlightsByDeparture(String depIata) {
//	    String endpoint = "/flights";
//	    String fullUrl = apiProps.getBaseUrl() + endpoint
//	        + "?key=" + apiProps.getKey()
//	        + "&depIata=" + depIata;
//
//	    ResponseEntity<Object[]> response = restTemplate.getForEntity(fullUrl, Object[].class);
//	    return Arrays.asList(response.getBody());
//	}
}
