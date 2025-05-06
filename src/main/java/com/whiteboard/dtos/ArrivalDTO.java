package com.whiteboard.dtos;

import lombok.Getter;
import lombok.Setter;


@Setter
@Getter
public class ArrivalDTO {

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