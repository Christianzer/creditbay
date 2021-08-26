package com.mycompany.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mycompany.models.ScieteClient;
import com.mycompany.repository.ScieteClientRepository;

@Service
public class ScieteClientService {
	
	@Autowired
	private ScieteClientRepository scieteclientRepository;
		
	   
		public List<ScieteClient> getscieteclient(){
			return scieteclientRepository.findAll();
			
		}
		
		//Fonction pour enregistrer un nouveau scieteclient
		public void save(ScieteClient scieteclient) {
			scieteclientRepository.save(scieteclient);
		}
		
		public Optional<ScieteClient> findById(Integer id) {
		
		
			return scieteclientRepository.findById(id);
			
		}

		public void delete(Integer id) {
			 
			scieteclientRepository.deleteById(id);
			
		}

}
