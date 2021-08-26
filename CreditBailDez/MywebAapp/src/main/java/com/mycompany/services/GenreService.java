package com.mycompany.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mycompany.models.Genre;
import com.mycompany.repository.GenreRepository;

@Service
public class GenreService {
	
	@Autowired
	private GenreRepository genreRepository;
		
	   
		public List<Genre> getgenre(){
			return genreRepository.findAll();
			
		}
		
		//Genre pour enregistrer un nouveau genre
		public void save(Genre genre) {
			genreRepository.save(genre);
		}
		
		public Optional<Genre> findById(Integer id) {
		
		
			return genreRepository.findById(id);
			
		}

		public void delete(Integer id) {
			 
			genreRepository.deleteById(id);
			
		}

}
