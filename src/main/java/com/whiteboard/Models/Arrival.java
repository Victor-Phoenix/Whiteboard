package com.whiteboard.Models;

import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

@Embeddable
@Setter
@Getter
public class Arrival {

	private String actualRunway;
	private String actualTime;
	private String baggage;
	private String delay;
	private String estimatedRunway;
	private String estimatedTime;
	private String gate;
	private String iataCode;
	private String icaoCode;
	private String scheduledTime;
	private String terminal;
	
}