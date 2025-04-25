package com.whiteboard.Service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.whiteboard.Models.Agent;
import com.whiteboard.Repositories.AgentRepository;

@Service
public class AgentService {

	@Autowired
	AgentRepository agentRepo;

	public List<Agent> getAllAgents() {
		
		return agentRepo.findAll();
	}
}
