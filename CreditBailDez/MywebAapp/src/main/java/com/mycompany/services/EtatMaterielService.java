package com.mycompany.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mycompany.models.EtatMateriel;
import com.mycompany.repository.EtatMaterielRepository;

@Service
public class EtatMaterielService {
	
	@Autowired
	private EtatMaterielRepository etatmaterielRepository;
		
	   
		public List<EtatMateriel> getetatmateriel(){
			return etatmaterielRepository.findAll();
			
		}
		
		//Fonction pour enregistrer un nouveau etatmateriel
		public void save(EtatMateriel etatmateriel) {
			etatmaterielRepository.save(etatmateriel);
		}
		
		public Optional<EtatMateriel> findById(Integer id) {
		
		
			return etatmaterielRepository.findById(id);
			
		}

		public void delete(Integer id) {
			 
			etatmaterielRepository.deleteById(id);
			
		}


}
