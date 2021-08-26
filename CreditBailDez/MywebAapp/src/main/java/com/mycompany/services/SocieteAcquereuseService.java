package com.mycompany.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mycompany.models.SocieteAcquereuse;
import com.mycompany.repository.SocieteAcquereuseRepository;

@Service
public class SocieteAcquereuseService {
	
	@Autowired
	private SocieteAcquereuseRepository societeacquereuseRepository;
		
	   
		public List<SocieteAcquereuse> getsocieteacquereuse(){
			return societeacquereuseRepository.findAll();
			
		}
		
		//Fonction pour enregistrer un nouveau societeacquereuse
		public void save(SocieteAcquereuse societeacquereuse) {
			societeacquereuseRepository.save(societeacquereuse);
		}
		
		public Optional<SocieteAcquereuse> findById(Integer id) {
		
		
			return societeacquereuseRepository.findById(id);
			
		}

		public void delete(Integer id) {
			 
			societeacquereuseRepository.deleteById(id);
			
		}

}
