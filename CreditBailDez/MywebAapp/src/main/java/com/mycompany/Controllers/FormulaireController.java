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

import com.mycompany.models.Formulaire;
import com.mycompany.services.FormulaireService;

@Controller
public class FormulaireController {
	
	@Autowired
	private FormulaireService formulaireService;
	
	@GetMapping("/formulaire")
	public String getformulaire(Model model) {
		
		List<Formulaire> formulaireList =formulaireService.getformulaire();
		model.addAttribute("formulaires",formulaireList);
		
		return "Formulaire";
		
	}
	
	@PostMapping("/formulaire/ajouter")
	public String ajouter(Formulaire formulaire) {
		
		formulaireService.save(formulaire);
		return"redirect:/formulaire";
	}
	
	@RequestMapping("formulaire/findById")
	@ResponseBody
	public Optional<Formulaire> findById(Integer id) {
		
		return formulaireService.findById(id);
	}
	
	@RequestMapping(value="formulaire/Modifier",method= {RequestMethod.PUT,RequestMethod.GET})
	public String Modifier(Formulaire formulaire) {
		
		formulaireService.save(formulaire);
		return"redirect:/formulaire";
		
	}
	
	@RequestMapping(value="formulaire/supprimer",method= {RequestMethod.DELETE,RequestMethod.GET})
	public String supprimer(Integer id) {
		
		formulaireService.delete(id);
		return"redirect:/formulaire";
		
	}

}
