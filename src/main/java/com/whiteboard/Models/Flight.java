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

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.Set;
@Table
@Entity
@Getter
@Setter
public class Flight {

	//TODO get info from aviation edge
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String flightNumber;
    private LocalDateTime departureTime;
    private LocalDateTime arrivalTime;
    private String origin;
    private String destination;

    @ManyToMany(mappedBy = "assignedToFlights")
    private Set<Agent> assignedAgents;

    // Constructors, getters, setters
    
    // TODO constructors needs to be filled wit flight information?
    
   
}
