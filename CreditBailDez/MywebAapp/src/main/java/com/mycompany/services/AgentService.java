package com.mycompany.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mycompany.models.Agent;
import com.mycompany.repository.AgentRepository;

@Service
public class AgentService {
	

	@Autowired
	private AgentRepository agentRepository;
		                                               
	   
		public List<Agent> getagent(){
			return agentRepository.findAll();
			
		}
		
		//Fonction pour enregistrer un nouveau agent
		public void save(Agent agent) {
			agentRepository.save(agent);
		}
		
		public Optional<Agent> findById(Integer id) {
		
		
			return agentRepository.findById(id);
			
		}

		public void delete(Integer id) {
			 
			agentRepository.deleteById(id);
			
		}

}
