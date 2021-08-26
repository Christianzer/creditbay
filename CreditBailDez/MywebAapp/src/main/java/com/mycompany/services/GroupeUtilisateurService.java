package com.mycompany.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mycompany.models.GroupeUtilisateur;
import com.mycompany.models.GroupeUtilisateur;
import com.mycompany.repository.GroupeUtilisateurRepository;

@Service
public class GroupeUtilisateurService {

	@Autowired
	private GroupeUtilisateurRepository groupeutilisateurRepository;
		
	   
		public List<GroupeUtilisateur> getgroupeutilisateur(){
			return groupeutilisateurRepository.findAll(); 
			
		}
		
		//GroupeUtilisateur pour enregistrer un nouveau groupeutilisateur
		public void save(GroupeUtilisateur groupeutilisateur) {
			groupeutilisateurRepository.save(groupeutilisateur);
		}
		
		public Optional<GroupeUtilisateur> findById(Integer id) {
		
		
			return groupeutilisateurRepository.findById(id);
			
		}

		public void delete(Integer id) {
			 
			groupeutilisateurRepository.deleteById(id);
			
		}
}
