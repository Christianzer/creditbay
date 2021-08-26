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
import com.mycompany.models.Banque;
import com.mycompany.models.Client;
import com.mycompany.models.Contrat;
import com.mycompany.models.Versement;
import com.mycompany.services.AgentService;
import com.mycompany.services.BanqueService;
import com.mycompany.services.ClientService;
import com.mycompany.services.ContratService;
import com.mycompany.services.VersementService;

@Controller
public class VersementController {
	
	@Autowired
	private VersementService versementService;
	@Autowired
	private ClientService clientService;
	@Autowired
	private AgentService agentService;
	@Autowired
	private ContratService contratService;
	@Autowired
	private BanqueService banqueService;
	
	@GetMapping("/versement")
	public String getversement(Model model) {
		
		List<Versement> versementList =versementService.getversement();
		List<Client> clientList =clientService.getclient();
		List<Agent> agentList =agentService.getagent();
		List<Contrat> contratList =contratService.getcontrat();
		List<Banque> banqueList =banqueService.getbanque();
		
		model.addAttribute("versements",versementList);
		model.addAttribute("clients",clientList);
		model.addAttribute("agents",agentList);
		model.addAttribute("contrats", contratList);
		model.addAttribute("banques", banqueList);
		
		return "Versement";
		
	}
	
	@PostMapping("/versement/ajouter")
	public String ajouter(Versement versement) { 
		
		versementService.save(versement);
		return"redirect:/versement";
	}
	
	@RequestMapping("versement/findById")
	@ResponseBody
	public Optional<Versement> findById(Integer id) {
		
		return versementService.findById(id);
	}
	
	@RequestMapping(value="versement/Modifier",method= {RequestMethod.PUT,RequestMethod.GET})
	public String Modifier(Versement versement) {
		
		versementService.save(versement);
		return"redirect:/versement";
		
	}
	
	@RequestMapping(value="versement/supprimer",method= {RequestMethod.DELETE,RequestMethod.GET})
	public String supprimer(Integer id) {
		
		versementService.delete(id);
		return"redirect:/versement";
		
	}


}
