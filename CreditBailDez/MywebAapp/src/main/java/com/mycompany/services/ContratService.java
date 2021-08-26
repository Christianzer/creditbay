package com.mycompany.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mycompany.models.Contrat;
import com.mycompany.repository.ContratRepository;

@Service
public class ContratService {


	@Autowired
	private ContratRepository contratRepository;
		                                               
	   
		public List<Contrat> getcontrat(){
			return contratRepository.findAll();
			
		}
		
		//Fonction pour enregistrer un nouveau contrat
		public void save(Contrat contrat) {
			contratRepository.save(contrat);
		}
		
		public Optional<Contrat> findById(Integer id) {
		
		
			return contratRepository.findById(id);
			
		}
		
		
		public void delete(Integer id) {
			 
			contratRepository.deleteById(id);
			
		}

}
