/*
 *  Flight.java
 *  
 *  Summary: This java class is a model that will represent the flights in our project. Each 
 *  Flight will be its on entity, stored on our prostgreSQL database, so we can create the 
 *  schedule for the day of (maybe before and after) work. 
 * 	Methods:
 * 
 */

package com.whiteboard.Models;

import java.util.Set;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Table
@Entity
@Getter
@Setter
public class FlightScheduleDTO {

	//TODO get info from aviation edge
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

	@Embedded
		private Airline airline;
	@Embedded
		private Arrival arrival;
	@Embedded
	private CodeShared codeShare;
	@Embedded
	private Departure departure;
	@Embedded
	private Flight flight; // or rename to avoid conflict
		private String status;
		private String type;


    @ManyToMany(mappedBy = "assignedToFlights")
    private Set<Agent> assignedAgents;


    
}
