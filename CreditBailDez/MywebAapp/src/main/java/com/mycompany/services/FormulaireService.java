package com.mycompany.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mycompany.models.Formulaire;
import com.mycompany.repository.FormulaireRepository;

@Service
public class FormulaireService {
	
	@Autowired
	private FormulaireRepository formulaireRepository;
		
	   
		public List<Formulaire> getformulaire(){
			return formulaireRepository.findAll();
			
		}
		
		//Fonction pour enregistrer un nouveau formulaire
		public void save(Formulaire formulaire) {
			formulaireRepository.save(formulaire);
		}
		
		public Optional<Formulaire> findById(Integer id) {
		
		
			return formulaireRepository.findById(id);
			
		}

		public void delete(Integer id) {
			 
			formulaireRepository.deleteById(id);
			
		}

}
