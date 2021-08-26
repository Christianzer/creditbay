package com.mycompany.Controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.ui.Model;
import com.mycompany.models.Formulaire;
import com.mycompany.services.FormulaireService;
import com.mycompany.models.Formulaire;
@Controller
public class DemandeCBController {
	private FormulaireService formulaireService;
	public DemandeCBController(FormulaireService formulaireService) {
		this.formulaireService=formulaireService;
	}
	@GetMapping("/demandecb")
	public String getdemande(Model model) {
		model.addAttribute("formulaire",new Formulaire());
		return "demande";
		
	}
	
	@PostMapping("/demandecb")
	public String postconcerner(@ModelAttribute("formulaire") Formulaire formulaire) {
		formulaireService.save(formulaire);
		return "redirect:/";
		
	}

}
