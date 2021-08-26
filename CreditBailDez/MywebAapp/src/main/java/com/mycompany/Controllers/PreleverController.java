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
import com.mycompany.models.Prelever;
import com.mycompany.services.AgentService;
import com.mycompany.services.BanqueService;
import com.mycompany.services.ClientService;
import com.mycompany.services.ContratService;
import com.mycompany.services.PreleverService;

@Controller
public class PreleverController {
	
	@Autowired
	private PreleverService prelevementService;
	@Autowired
	private ClientService clientService;
	@Autowired
	private AgentService agentService;
	@Autowired
	private ContratService contratService;
	@Autowired
	private BanqueService banqueService;
	
	@GetMapping("/prelevement")
	public String getprelevement(Model model) {
		
		List<Prelever> prelevementList =prelevementService.getprelevement();
		List<Client> clientList =clientService.getclient();
		List<Agent> agentList =agentService.getagent();
		List<Contrat> contratList =contratService.getcontrat();
		List<Banque> banqueList =banqueService.getbanque();
		
		model.addAttribute("prelevements",prelevementList);
		model.addAttribute("clients",clientList);
		model.addAttribute("agents",agentList);
		model.addAttribute("contrats", contratList);
		model.addAttribute("banques", banqueList);
		
		return "Prelevement";
		
	}
	
	@PostMapping("/prelevement/ajouter")
	public String ajouter(Prelever prelevement) { 
		
		prelevementService.save(prelevement);
		return"redirect:/prelevement";
	}
	
	@RequestMapping("prelevement/findById")
	@ResponseBody
	public Optional<Prelever> findById(Integer id) {
		
		return prelevementService.findById(id);
	}
	
	@RequestMapping(value="prelevement/Modifier",method= {RequestMethod.PUT,RequestMethod.GET})
	public String Modifier(Prelever prelevement) {
		
		prelevementService.save(prelevement);
		return"redirect:/prelevement";
		
	}
	
	@RequestMapping(value="prelevement/supprimer",method= {RequestMethod.DELETE,RequestMethod.GET})
	public String supprimer(Integer id) {
		
		prelevementService.delete(id);
		return"redirect:/prelevement";
		
	}

}
