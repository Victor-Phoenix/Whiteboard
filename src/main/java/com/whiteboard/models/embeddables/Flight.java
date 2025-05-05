package com.whiteboard.models.embeddables;

import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

@Embeddable
@Getter
@Setter
public class Flight {
	private String iataNumber;
	private String icaoNumber;
	private String number;
}
