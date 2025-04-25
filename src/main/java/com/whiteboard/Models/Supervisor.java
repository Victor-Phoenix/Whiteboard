package com.whiteboard.Models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Setter;
import lombok.AccessLevel;

@Entity
public class Supervisor extends TeamLead {

	public Supervisor(String name, String username, String password) {
		super(name, username, password);
		// TODO Auto-generated constructor stub
	}

}
