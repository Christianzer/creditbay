package com.mycompany.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mycompany.models.NiveauAcces;
import com.mycompany.repository.NiveauAccesRepository;

@Service
public class NiveauAccessService {
	
	@Service
	public class NiveauAccesService {
		
		@Autowired
		private NiveauAccesRepository niveauaccesRepository;
			
		   
			public List<NiveauAcces> getniveauacces(){
				return niveauaccesRepository.findAll();
				
			}
			
			//NiveauAcces pour enregistrer un nouveau niveauacces
			public void save(NiveauAcces niveauacces) {
				niveauaccesRepository.save(niveauacces);
			}
			
			public Optional<NiveauAcces> findById(Integer id) {
			
			
				return niveauaccesRepository.findById(id);
				
			}

			public void delete(Integer id) {
				 
				niveauaccesRepository.deleteById(id);
				
			}


}

}
