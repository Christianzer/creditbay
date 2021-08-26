package com.mycompany.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mycompany.models.CategorieMateriel;
import com.mycompany.repository.CategorieMaterielRepository;

@Service
public class CategorieMaterielService {
	

@Autowired
private CategorieMaterielRepository categoriematerielRepository;
	
   
	public List<CategorieMateriel> getcategoriemateriel(){
		return categoriematerielRepository.findAll();
		
	}
	
	//Fonction pour enregistrer un nouveau categoriemateriel
	public void save(CategorieMateriel categoriemateriel) {
		categoriematerielRepository.save(categoriemateriel);
	}
	
	public Optional<CategorieMateriel> findById(Integer id) {
	
	
		return categoriematerielRepository.findById(id);
		
	}

	public void delete(Integer id) {
		 
		categoriematerielRepository.deleteById(id);
		
	}

}
