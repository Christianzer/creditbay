package com.mycompany.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mycompany.models.AchatMateriel;
import com.mycompany.repository.AchatMaterielRepository;

@Service
public class AchatMaterielService {
	
	@Autowired
	private AchatMaterielRepository achatmaterielRepository;
		
	   
		public List<AchatMateriel> getachatmateriel(){
			return achatmaterielRepository.findAll();
			
		}
		
		//AchatMateriel pour enregistrer un nouveau achatmateriel
		public void save(AchatMateriel achatmateriel) {
			achatmaterielRepository.save(achatmateriel);
		}
		
		public Optional<AchatMateriel> findById(Integer id) {
		
		
			return achatmaterielRepository.findById(id);
			
		}

		public void delete(Integer id) {
			 
			achatmaterielRepository.deleteById(id);
			
		}

}
