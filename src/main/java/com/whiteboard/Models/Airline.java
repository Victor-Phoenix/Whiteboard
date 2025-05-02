package com.whiteboard.Models;

import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

@Embeddable
@Setter
@Getter
public class Airline {

	private String iatacode;
	private String icaoCode;
	private String name;

}
