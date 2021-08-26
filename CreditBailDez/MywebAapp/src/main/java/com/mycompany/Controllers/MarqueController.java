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

import com.mycompany.models.Marque;
import com.mycompany.services.MarqueService;

@Controller
public class MarqueController {
	
	@Autowired
	private MarqueService marqueService;
	
	@GetMapping("/marque")
	public String getmarque(Model model) {
		
		List<Marque> marqueList =marqueService.getmarque();
		model.addAttribute("marques",marqueList);
		
		return "Marque";
		
	}
	
	@PostMapping("/marque/ajouter")
	public String ajouter(Marque marque) {
		
		marqueService.save(marque);
		return"redirect:/marque";
	}
	
	@RequestMapping("marque/findById")
	@ResponseBody
	public Optional<Marque> findById(Integer id) {
		
		return marqueService.findById(id);
	}
	
	@RequestMapping(value="marque/Modifier",method= {RequestMethod.PUT,RequestMethod.GET})
	public String Modifier(Marque marque) {
		
		marqueService.save(marque);
		return"redirect:/marque";
		
	}
	
	@RequestMapping(value="marque/supprimer",method= {RequestMethod.DELETE,RequestMethod.GET})
	public String supprimer(Integer id) {
		
		marqueService.delete(id);
		return"redirect:/marque";
		
	}
}