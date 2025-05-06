package com.whiteboard.models.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table
@Getter
@Setter
public class FlightSchedule {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	// Airline Info
	private String airlineName;
	private String airlineIataCode;
	private String airlineIcaoCode;

	// Arrival Info
	private String arrivalGate;
	private String arrivalTerminal;
	private String arrivalIataCode;
	private String arrivalIcaoCode;
	private String arrivalScheduledTime;

	// Departure Info
	private String departureGate;
	private String departureTerminal;
	private String departureIataCode;
	private String departureIcaoCode;
	private String departureScheduledTime;

	// Flight Info
	private String flightNumber;
	private String flightIataNumber;
	private String flightIcaoNumber;

	// Status / Type
	private String status; // landed, scheduled, cancelled, etc.
	private String type; // arrival or departure
}
