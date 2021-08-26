package com.mycompany.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mycompany.models.Periode;
import com.mycompany.repository.PeriodeRepository;

@Service
public class PeriodeService {
	
	@Autowired
	private PeriodeRepository periodeRepository;

	public List<Periode> getperiode(){
		return periodeRepository.findAll();
		
	}
	
	//Periode pour enregistrer un nouveau periode
	public void save(Periode periode) {
		periodeRepository.save(periode);
	}
	
	public Optional<Periode> findById(Integer id) {
	
	
		return periodeRepository.findById(id);
		
	}

	public void delete(Integer id) {
		 
		periodeRepository.deleteById(id);
		
	}

}
