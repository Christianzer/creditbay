package com.mycompany.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mycompany.models.TypeUtilisateurs;
import com.mycompany.repository.TypeUtilisateurRepository;

@Service
public class TypeUtilisateurService {
	
	@Autowired
	private TypeUtilisateurRepository typeutilisateurRepository;
		
	   
		public List<TypeUtilisateurs> gettypeutilisateur(){
			return typeutilisateurRepository.findAll();
			
		}
		
		//TypeUtilisateur pour enregistrer un nouveau typeutilisateur
		public void save(TypeUtilisateurs typeutilisateur) {
			typeutilisateurRepository.save(typeutilisateur);
		}
		
		public Optional<TypeUtilisateurs> findById(Integer id) {
		
		
			return typeutilisateurRepository.findById(id);
			
		}

		public void delete(Integer id) {
			 
			typeutilisateurRepository.deleteById(id);
			
		}

}
