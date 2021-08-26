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

import com.mycompany.models.Fonction;
import com.mycompany.services.FonctionService;

@Controller
public class FonctionController {
	@Autowired
	private FonctionService fonctionService;
	
	@GetMapping("/fonction")
	public String getfonction(Model model) {
		
		List<Fonction> fonctionList =fonctionService.getfonction();
		model.addAttribute("fonctions",fonctionList);
		
		return "Fonction";
		
	}
	
	@PostMapping("/fonction/ajouter")
	public String ajouter(Fonction fonction) {
		
		fonctionService.save(fonction);
		return"redirect:/fonction";
	}
	
	@RequestMapping("fonction/findById")
	@ResponseBody
	public Optional<Fonction> findById(Integer id) {
		
		return fonctionService.findById(id);
	}
	
	@RequestMapping(value="fonction/Modifier",method= {RequestMethod.PUT,RequestMethod.GET})
	public String Modifier(Fonction fonction) {
		
		fonctionService.save(fonction);
		return"redirect:/fonction";
		
	}
	
	@RequestMapping(value="fonction/supprimer",method= {RequestMethod.DELETE,RequestMethod.GET})
	public String supprimer(Integer id) {
		
		fonctionService.delete(id);
		return"redirect:/fonction";
		
	}

}
