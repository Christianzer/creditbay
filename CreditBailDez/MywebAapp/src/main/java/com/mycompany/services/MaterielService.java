package com.mycompany.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mycompany.models.Materiel;
import com.mycompany.repository.MaterielRepository;

@Service
public class MaterielService {
	
	@Autowired
	private MaterielRepository materielRepository;
		
	   
		public List<Materiel> getmateriel(){
			return materielRepository.findAll();
			
		}
		
		//Fonction pour enregistrer un nouveau materiel
		public void save(Materiel materiel) {
			materielRepository.save(materiel);
		}
		
		public Optional<Materiel> findById(Integer id) {
		
		
			return materielRepository.findById(id);
			
		}

		public void delete(Integer id) {
			 
			materielRepository.deleteById(id);
			
		}

}
