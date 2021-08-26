package com.mycompany.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mycompany.models.Encaisser;
import com.mycompany.repository.EncaisserRepository;

@Service
public class EncaissementService {
	
	@Autowired
	private EncaisserRepository encaissementRepository;
		                                               
	   
		public List<Encaisser> getencaissement(){
			return encaissementRepository.findAll();
			
		}
		
		//Fonction pour enregistrer un nouveau encaissement
		public void save(Encaisser encaissement) {
			encaissementRepository.save(encaissement);
		}
		
		public Optional<Encaisser> findById(Integer id) {
		
		
			return encaissementRepository.findById(id);
			
		}

		public void delete(Integer id) {
			 
			encaissementRepository.deleteById(id);
			
		}

}
