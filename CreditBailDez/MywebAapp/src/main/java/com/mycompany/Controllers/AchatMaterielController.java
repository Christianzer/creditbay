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

import com.mycompany.models.Agent;
import com.mycompany.models.Fournisseur;
import com.mycompany.models.AchatMateriel;
import com.mycompany.models.Materiel;
import com.mycompany.services.AgentService;
import com.mycompany.services.FournisseurService;
import com.mycompany.services.AchatMaterielService;
import com.mycompany.services.MaterielService;


@Controller
public class AchatMaterielController {
	
	@Autowired
	private AchatMaterielService achatmaterielService;
	@Autowired
	private MaterielService materielService;
	@Autowired
	private AgentService agentService;
	@Autowired
	private FournisseurService fournisseurService;
	
	
	
	@GetMapping("/achatmateriel")
	public String getachatmateriel(Model model) {
		
		List<AchatMateriel> achatmaterielList =achatmaterielService.getachatmateriel();
		List<Agent> agentList =agentService.getagent();
		List<Materiel> materielList =materielService.getmateriel();
		List<Fournisseur> fournisseurList =fournisseurService.getfournisseur();
		
		
		model.addAttribute("achatmateriels",achatmaterielList);
		model.addAttribute("fournisseurs",fournisseurList);
		model.addAttribute("agents",agentList);
		model.addAttribute("materiels", materielList);
		
		
		return "AchatMateriel";
		
	}
	
	@PostMapping("/achatmateriel/ajouter")
	public String ajouter(AchatMateriel achatmateriel) { 
		
		achatmaterielService.save(achatmateriel);
		return"redirect:/achatmateriel";
	}
	
	@RequestMapping("achatmateriel/findById")
	@ResponseBody
	public Optional<AchatMateriel> findById(Integer id) {
		
		return achatmaterielService.findById(id);
	}
	
	@RequestMapping(value="achatmateriel/Modifier",method= {RequestMethod.PUT,RequestMethod.GET})
	public String Modifier(AchatMateriel achatmateriel) {
		
		achatmaterielService.save(achatmateriel);
		return"redirect:/achatmateriel";
		
	}
	
	@RequestMapping(value="achatmateriel/supprimer",method= {RequestMethod.DELETE,RequestMethod.GET})
	public String supprimer(Integer id) {
		
		achatmaterielService.delete(id);
		return"redirect:/achatmateriel";
		
	}


}
