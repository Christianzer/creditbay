package com.mycompany.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mycompany.models.Client;
import com.mycompany.repository.ClientRepository;

@Service
public class ClientService {
	
	@Autowired
	private ClientRepository clientRepository;
		
	   
		public List<Client> getclient(){
			return clientRepository.findAll();
			
		}
		
		//Fonction pour enregistrer un nouveau client
		public void save(Client client) {
			clientRepository.save(client);
		}
		
		public Optional<Client> findById(Integer id) {
		
		
			return clientRepository.findById(id);
			
		}

		public void delete(Integer id) {
			 
			clientRepository.deleteById(id);
			
		}

}
