package com.whiteboard.models.entities;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class TeamLead extends Agent{
	
	
	public TeamLead(String name, String username, String password) {
		super(name, username, password);

	}

//	
	
}
