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

import com.mycompany.models.Traitements;
import com.mycompany.services.TraitementService;

@Controller
public class TraitementController {
	@Autowired
	private TraitementService traitementService;
	
	@GetMapping("/traitement")
	public String gettraitement(Model model) {
		
		List<Traitements> traitementList =traitementService.gettraitement();
		model.addAttribute("traitements",traitementList);
		
		return "Traitements";
		
	}
	
	@PostMapping("/traitement/ajouter")
	public String ajouter(Traitements traitement) {
		
		traitementService.save(traitement);
		return"redirect:/traitement";
	}
	
	@RequestMapping("traitement/findById")
	@ResponseBody
	public Optional<Traitements> findById(Integer id) {
		
		return traitementService.findById(id);
	}
	
	@RequestMapping(value="traitement/Modifier",method= {RequestMethod.PUT,RequestMethod.GET})
	public String Modifier(Traitements traitement) {
		
		traitementService.save(traitement);
		return"redirect:/traitement";
		
	}
	
	@RequestMapping(value="traitement/supprimer",method= {RequestMethod.DELETE,RequestMethod.GET})
	public String supprimer(Integer id) {
		
		traitementService.delete(id);
		return"redirect:/traitement";
		
	}


}
