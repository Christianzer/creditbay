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

import com.mycompany.models.EtatMateriel;
import com.mycompany.services.EtatMaterielService;

@Controller
public class EtatMaterielController {
	@Autowired
	private EtatMaterielService etatmaterielService;
	
	@GetMapping("/etatmateriel")
	public String getetatmateriel(Model model) {
		
		List<EtatMateriel> etatmaterielList =etatmaterielService.getetatmateriel();
		model.addAttribute("etatmateriels",etatmaterielList);
		
		return "EtatMateriel";
		
	}
	
	@PostMapping("/etatmateriel/ajouter")
	public String ajouter(EtatMateriel etatmateriel) {
		
		etatmaterielService.save(etatmateriel);
		return"redirect:/etatmateriel";
	}
	
	@RequestMapping("etatmateriel/findById")
	@ResponseBody
	public Optional<EtatMateriel> findById(Integer id) {
		
		return etatmaterielService.findById(id);
	}
	
	@RequestMapping(value="etatmateriel/Modifier",method= {RequestMethod.PUT,RequestMethod.GET})
	public String Modifier(EtatMateriel etatmateriel) {
		
		etatmaterielService.save(etatmateriel);
		return"redirect:/etatmateriel";
		
	}
	
	@RequestMapping(value="etatmateriel/supprimer",method= {RequestMethod.DELETE,RequestMethod.GET})
	public String supprimer(Integer id) {
		
		etatmaterielService.delete(id);
		return"redirect:/etatmateriel";
		
	}


}
