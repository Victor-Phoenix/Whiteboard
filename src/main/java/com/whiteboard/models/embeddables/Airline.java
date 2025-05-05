package com.whiteboard.models.embeddables;

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
