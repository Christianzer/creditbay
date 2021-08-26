package com.mycompany.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mycompany.models.Fonction;
import com.mycompany.repository.FonctionRepository;

@Service
public class FonctionService {

	@Autowired
	private FonctionRepository fonctionRepository;
		
	   
		public List<Fonction> getfonction(){
			return fonctionRepository.findAll();
			
		}
		
		//Fonction pour enregistrer un nouveau fonction
		public void save(Fonction fonction) {
			fonctionRepository.save(fonction);
		}
		
		public Optional<Fonction> findById(Integer id) {
		
		
			return fonctionRepository.findById(id);
			
		}

		public void delete(Integer id) {
			 
			fonctionRepository.deleteById(id);
			
		}

}
