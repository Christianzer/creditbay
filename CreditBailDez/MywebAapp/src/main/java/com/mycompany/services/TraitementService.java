package com.mycompany.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mycompany.models.Traitements;
import com.mycompany.repository.TraitementsRepository;

@Service
public class TraitementService {
	
	@Autowired
	private TraitementsRepository traitementRepository;
		
	   
		public List<Traitements> gettraitement(){
			return traitementRepository.findAll();
			
		}
		
		//Traitements pour enregistrer un nouveau traitement
		public void save(Traitements traitement) {
			traitementRepository.save(traitement);
		}
		
		public Optional<Traitements> findById(Integer id) {
		
		
			return traitementRepository.findById(id);
			
		}

		public void delete(Integer id) {
			 
			traitementRepository.deleteById(id);
			
		}


}
