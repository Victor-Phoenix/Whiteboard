package com.whiteboard.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.whiteboard.models.entities.Agent;
import com.whiteboard.repositories.AgentRepository;

@Service
public class AgentService {

	@Autowired
	AgentRepository agentRepo;

	public List<Agent> getAllAgents() {
		
		return agentRepo.findAll();
	}
}
