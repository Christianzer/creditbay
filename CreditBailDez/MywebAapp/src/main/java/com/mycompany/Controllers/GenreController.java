package com.mycompany.Controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mycompany.models.Genre;
import com.mycompany.services.GenreService;

@Controller
public class GenreController {
	
	@Autowired
	private GenreService genreService;
	
	@GetMapping("/genre")
	public String getgenre(Model model) {
		
		List<Genre> genreList =genreService.getgenre();
		model.addAttribute("genres",genreList);
		
		return "Genre";
		
	}
	
	@PostMapping("/genre/ajouter")
	public String ajouter(Genre genre) {
		
		genreService.save(genre);
		return"redirect:/genre";
	}
	
	@RequestMapping("genre/findById")
	@ResponseBody
	public Optional<Genre> findById(Integer id) {
		
		return genreService.findById(id);
	}
	
	@RequestMapping(value="genre/Modifier",method= {RequestMethod.PUT,RequestMethod.GET})
	public String Modifier(Genre genre) {
		
		genreService.save(genre);
		return"redirect:/genre";
		
	}
	
	@RequestMapping(value="genre/supprimer",method= {RequestMethod.DELETE,RequestMethod.GET})
	public String supprimer(Integer id) {
		
		genreService.delete(id);
		return"redirect:/genre";
		
	}

}
