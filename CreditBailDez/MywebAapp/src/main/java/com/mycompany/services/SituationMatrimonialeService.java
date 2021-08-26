package com.mycompany.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mycompany.models.SituationMatrimoniale;
import com.mycompany.repository.SituationMatrimonialeRepository;

@Service
public class SituationMatrimonialeService {
	
	@Autowired
	private SituationMatrimonialeRepository situationmatrimonialeRepository;
		
	   
		public List<SituationMatrimoniale> getsituationmatrimoniale(){
			return situationmatrimonialeRepository.findAll();
			
		}
		
		//SituationMatrimoniale pour enregistrer un nouveau situationmatrimoniale
		public void save(SituationMatrimoniale situationmatrimoniale) {
			situationmatrimonialeRepository.save(situationmatrimoniale);
		}
		
		public Optional<SituationMatrimoniale> findById(Integer id) {
		
		
			return situationmatrimonialeRepository.findById(id);
			
		}

		public void delete(Integer id) {
			 
			situationmatrimonialeRepository.deleteById(id);
			
		}


}
