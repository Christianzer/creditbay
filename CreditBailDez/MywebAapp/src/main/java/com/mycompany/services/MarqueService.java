package com.mycompany.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mycompany.models.Marque;
import com.mycompany.repository.MarqueRepository;

@Service
public class MarqueService {
	
	@Autowired
	private MarqueRepository marqueRepository;
		
	   
		public List<Marque> getmarque(){
			return marqueRepository.findAll();
			
		}
		
		//Marque pour enregistrer un nouveau marque
		public void save(Marque marque) {
			marqueRepository.save(marque);
		}
		
		public Optional<Marque> findById(Integer id) {
		
		
			return marqueRepository.findById(id);
			
		}

		public void delete(Integer id) {
			 
			marqueRepository.deleteById(id);
			
		}

}
