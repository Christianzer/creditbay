package com.mycompany.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mycompany.models.Prelever;
import com.mycompany.repository.PreleverRepository;

@Service
public class PreleverService {
	
	@Autowired
	private PreleverRepository prelevementRepository;
		                                               
	   
		public List<Prelever> getprelevement(){
			return prelevementRepository.findAll();
			
		}
		
		//Fonction pour enregistrer un nouveau prelevement
		public void save(Prelever prelevement) {
			prelevementRepository.save(prelevement);
		}
		
		public Optional<Prelever> findById(Integer id) {
		
		
			return prelevementRepository.findById(id);
			
		}

		public void delete(Integer id) {
			 
			prelevementRepository.deleteById(id);
			
		}

}
