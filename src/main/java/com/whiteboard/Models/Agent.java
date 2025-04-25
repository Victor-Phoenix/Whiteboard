	package com.whiteboard.Models;
	
	import jakarta.persistence.*;
	import jakarta.validation.constraints.NotBlank;
	import jakarta.validation.constraints.Size;
	import lombok.Getter;
	import lombok.Setter;
	
	import java.time.LocalDateTime;
	
	@Entity
	@Table(name = "Agent")
	@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
	@DiscriminatorColumn(name = "role_type")
	@Getter
	@Setter
	public class Agent {
	
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	
	    @NotBlank
	    @Size(min = 3, max = 50)
	    @Column(nullable = false)
	    private String name;
	
	    private LocalDateTime creationDate;
	
	    @NotBlank
	    @Column(nullable = false)
	    private String username;
	
	    @NotBlank
	    @Column(nullable = false)
	    private String password;
	
	    public Agent() {
	        this.creationDate = LocalDateTime.now();
	    }
	
	    public Agent(String name, String username, String password) {
	        this.name = name;
	        this.username = username;
	        this.password = password;
	        this.creationDate = LocalDateTime.now();
	    }
	}
