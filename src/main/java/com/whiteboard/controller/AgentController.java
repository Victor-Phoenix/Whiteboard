package com.whiteboard.controller;

import com.whiteboard.models.entities.Agent;
import com.whiteboard.repositories.AgentRepository;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/agent")
public class AgentController {

    @Autowired
    private AgentRepository agentRepo;

    @PostMapping("/addAgent")
    public Agent addAgent(@RequestBody @Valid Agent agent) {
        System.out.println("Adding agent: " + agent.getUsername());
        return agentRepo.save(agent);
    }

    @GetMapping("/getAllAgent")
    public List<Agent> getAllAgents() {
        return agentRepo.findAll();
    }
    
    @GetMapping("/getAgent/{id}")
    public Agent getAgentById(@PathVariable Long id) {
        return agentRepo.findById(id).orElse(null); // Or throw custom error if not found
    }
    
    @DeleteMapping("/deleteAgent/{id}")
    public void deleteAgentByID(@PathVariable Long id) {
    	agentRepo.deleteById(id);
    }
    

}
