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

import com.mycompany.models.AvoirEtat;
import com.mycompany.models.Agent;
import com.mycompany.models.Fournisseur;
import com.mycompany.models.Materiel;
import com.mycompany.services.AvoirEtatService;
import com.mycompany.services.AgentService;
import com.mycompany.services.FournisseurService;
import com.mycompany.services.MaterielService;

@Controller
public class AvoirEtatController {
	
	@Autowired
	private AvoirEtatService avoiretatService;
	@Autowired
	private MaterielService materielService;
	@Autowired
	private AgentService agentService;
	@Autowired
	private FournisseurService fournisseurService;
	
	
	
	@GetMapping("/avoiretat")
	public String getavoiretat(Model model) {
		
		List<AvoirEtat> avoiretatList =avoiretatService.getavoiretat();
		List<Agent> agentList =agentService.getagent();
		List<Materiel> materielList =materielService.getmateriel();
		List<Fournisseur> fournisseurList =fournisseurService.getfournisseur();
		
		
		model.addAttribute("avoiretats",avoiretatList);
		model.addAttribute("fournisseurs",fournisseurList);
		model.addAttribute("agents",agentList);
		model.addAttribute("materiels", materielList);
		
		
		return "AvoirEtat";
		
	}
	
	@PostMapping("/avoiretat/ajouter")
	public String ajouter(AvoirEtat avoiretat) { 
		
		avoiretatService.save(avoiretat);
		return"redirect:/avoiretat";
	}
	
	@RequestMapping("avoiretat/findById")
	@ResponseBody
	public Optional<AvoirEtat> findById(Integer id) {
		
		return avoiretatService.findById(id);
	}
	
	@RequestMapping(value="avoiretat/Modifier",method= {RequestMethod.PUT,RequestMethod.GET})
	public String Modifier(AvoirEtat avoiretat) {
		
		avoiretatService.save(avoiretat);
		return"redirect:/avoiretat";
		
	}
	
	@RequestMapping(value="avoiretat/supprimer",method= {RequestMethod.DELETE,RequestMethod.GET})
	public String supprimer(Integer id) {
		
		avoiretatService.delete(id);
		return"redirect:/avoiretat";
		
	}




}
