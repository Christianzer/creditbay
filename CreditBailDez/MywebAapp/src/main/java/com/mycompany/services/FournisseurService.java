package com.mycompany.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mycompany.models.Fournisseur;
import com.mycompany.repository.FournisseurRepository;

@Service
public class FournisseurService {

@Autowired
private FournisseurRepository fournisseurRepository;
	
   
	public List<Fournisseur> getfournisseur(){
		return fournisseurRepository.findAll();
		
	}
	
	//Fonction pour enregistrer un nouveau fournisseur
	public void save(Fournisseur fournisseur) {
		fournisseurRepository.save(fournisseur);
	}
	
	public Optional<Fournisseur> findById(Integer id) {
	
	
		return fournisseurRepository.findById(id);
		
	}

	public void delete(Integer id) {
		 
		fournisseurRepository.deleteById(id);
		
	}

} 
