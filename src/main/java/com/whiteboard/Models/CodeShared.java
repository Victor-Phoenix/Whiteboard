package com.whiteboard.Models;

import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

@Embeddable
@Getter
@Setter
public class CodeShared {

	private Airline airline;
	private Flight flight;

}
