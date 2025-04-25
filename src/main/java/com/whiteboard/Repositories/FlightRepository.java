package com.whiteboard.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.whiteboard.Models.Flight;

public interface FlightRepository extends JpaRepository<Flight, Long>{

}
