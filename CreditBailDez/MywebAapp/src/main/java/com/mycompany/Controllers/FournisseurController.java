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

import com.mycompany.models.Fournisseur;
import com.mycompany.services.FournisseurService;

@Controller
public class FournisseurController {
	
	@Autowired
	private FournisseurService fournisseurService;
	
	@GetMapping("/fournisseur")
	public String getfournisseur(Model model) {
		
		List<Fournisseur> fournisseurList =fournisseurService.getfournisseur();
		model.addAttribute("fournisseurs",fournisseurList);
		
		return "Fournisseurs";
		
	}
	
	@PostMapping("/fournisseur/ajouter")
	public String ajouter(Fournisseur fournisseur) {
		
		fournisseurService.save(fournisseur);
		return"redirect:/fournisseur";
	}
	
	@RequestMapping("fournisseur/findById")
	@ResponseBody
	public Optional<Fournisseur> findById(Integer id) {
		
		return fournisseurService.findById(id);
	}
	
	@RequestMapping(value="fournisseur/Modifier",method= {RequestMethod.PUT,RequestMethod.GET})
	public String Modifier(Fournisseur fournisseur) {
		
		fournisseurService.save(fournisseur);
		return"redirect:/fournisseur";
		
	}
	
	@RequestMapping(value="fournisseur/supprimer",method= {RequestMethod.DELETE,RequestMethod.GET})
	public String supprimer(Integer id) {
		
		fournisseurService.delete(id);
		return"redirect:/fournisseur";
		
	}

}
