package com.mycompany.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mycompany.models.Banque;
import com.mycompany.repository.BanqueRepository;

@Service
public class BanqueService {
	
	@Autowired
	private BanqueRepository banqueRepository;
		
	   
		public List<Banque> getbanque(){
			return banqueRepository.findAll();
			
		}
		
		//Fonction pour enregistrer un nouveau banque
		public void save(Banque banque) {
			banqueRepository.save(banque);
		}
		
		public Optional<Banque> findById(Integer id) {
		
		
			return banqueRepository.findById(id);
			
		}

		public void delete(Integer id) {
			 
			banqueRepository.deleteById(id);
			
		}


}
