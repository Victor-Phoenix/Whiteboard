package com.whiteboard.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.whiteboard.Models.Agent;

public interface AgentRepository extends JpaRepository<Agent, Long> {
}
