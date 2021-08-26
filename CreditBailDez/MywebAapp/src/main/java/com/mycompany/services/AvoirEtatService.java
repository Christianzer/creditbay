package com.mycompany.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mycompany.models.AvoirEtat;
import com.mycompany.repository.AvoirEtatRepository;

@Service
public class AvoirEtatService {
	
	@Autowired
	private AvoirEtatRepository avoiretatRepository;
		
	   
		public List<AvoirEtat> getavoiretat(){
			return avoiretatRepository.findAll();
			
		}
		
		//Fonction pour enregistrer un nouveau avoiretat
		public void save(AvoirEtat avoiretat) {
			avoiretatRepository.save(avoiretat);
		}
		
		public Optional<AvoirEtat> findById(Integer id) {
		
		
			return avoiretatRepository.findById(id);
			
		}

		public void delete(Integer id) {
			 
			avoiretatRepository.deleteById(id);
			
		}


}
