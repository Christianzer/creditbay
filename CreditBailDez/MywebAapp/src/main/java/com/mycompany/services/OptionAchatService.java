package com.mycompany.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mycompany.models.OptionAchat;
import com.mycompany.repository.OptionAchatRepository;

@Service
public class OptionAchatService {
	
	@Autowired
	private OptionAchatRepository optionachatRepository;

	public List<OptionAchat> getoptionachat(){
		return optionachatRepository.findAll();
		
	}
	
	//OptionAchat pour enregistrer un nouveau optionachat
	public void save(OptionAchat optionachat) {
		optionachatRepository.save(optionachat);
	}
	
	public Optional<OptionAchat> findById(Integer id) {
	
	
		return optionachatRepository.findById(id);
		
	}

	public void delete(Integer id) {
		 
		optionachatRepository.deleteById(id);
		
	}

}
