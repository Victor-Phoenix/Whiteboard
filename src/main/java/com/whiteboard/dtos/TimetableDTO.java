/*
 *  Flight.java
 *  
 *  Summary: This java class is a model that will represent the flights in our project. Each 
 *  Flight will be its on entity, stored on our prostgreSQL database, so we can create the 
 *  schedule for the day of (maybe before and after) work. 
 * 	Methods:
 * 
 */

package com.whiteboard.dtos;

import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Table

@Getter
@Setter
public class TimetableDTO {

	
	private AirlineDTO airline;
	private ArrivalDTO arrival;
	private CodeSharedDTO codeShare;
	private DepartureDTO departure;
	private FlightDTO flight; // or rename to avoid conflict

	private String status;
	private String type;



    
}
