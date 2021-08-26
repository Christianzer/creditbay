package com.mycompany.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mycompany.models.Versement;
import com.mycompany.repository.VersementRepository;



@Service
public class VersementService {
	
	@Autowired
	private VersementRepository versementRepository;
		                                               
	   
		public List<Versement> getversement(){
			return versementRepository.findAll(); 
			
		}
		
		//Fonction pour enregistrer un nouveau versement
		public void save(Versement versement) {
			versementRepository.save(versement);
		}
		
		public Optional<Versement> findById(Integer id) {
		
		
			return versementRepository.findById(id);
			
		}

		public void delete(Integer id) {
			 
			versementRepository.deleteById(id);
			
		}
	

}
