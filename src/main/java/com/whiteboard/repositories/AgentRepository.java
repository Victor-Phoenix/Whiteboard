package com.whiteboard.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.whiteboard.models.entities.Agent;

@Repository
public interface AgentRepository extends JpaRepository<Agent, Long> {
}
