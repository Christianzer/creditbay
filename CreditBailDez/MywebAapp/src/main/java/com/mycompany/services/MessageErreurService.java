package com.mycompany.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mycompany.models.MessageErreurs;
import com.mycompany.repository.MessageErreurRepository;

@Service
public class MessageErreurService {
	
	@Autowired
	private MessageErreurRepository messageerreurRepository;
		
	   
		public List<MessageErreurs> getmessageerreur(){
			return messageerreurRepository.findAll();
			
		}
		
		//MessageErreurs pour enregistrer un nouveau messageerreur
		public void save(MessageErreurs messageerreur) {
			messageerreurRepository.save(messageerreur);
		}
		
		public Optional<MessageErreurs> findById(Integer id) {
		
		
			return messageerreurRepository.findById(id);
			
		}

		public void delete(Integer id) {
			 
			messageerreurRepository.deleteById(id);
			
		}

}
