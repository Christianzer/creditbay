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
import com.mycompany.models.Client;
import com.mycompany.models.Contrat;
import com.mycompany.models.Encaisser;
import com.mycompany.services.AgentService;
import com.mycompany.services.ClientService;
import com.mycompany.services.ContratService;
import com.mycompany.services.EncaissementService;


@Controller
public class EncaissementController {
	
	@Autowired
	private EncaissementService encaissementService;
	@Autowired
	private ClientService clientService;
	@Autowired
	private AgentService agentService;
	@Autowired
	private ContratService contratService;
	
	@GetMapping("/encaissement")
	public String getencaissement(Model model) {
		
		List<Encaisser> encaissementList =encaissementService.getencaissement();
		List<Client> clientList =clientService.getclient();
		List<Agent> agentList =agentService.getagent();
		List<Contrat> contratList =contratService.getcontrat();
		
		model.addAttribute("encaissements",encaissementList);
		model.addAttribute("clients",clientList);
		model.addAttribute("agents",agentList);
		model.addAttribute("contrats", contratList);
		
		return "Encaissement";
		
	}
	
	@PostMapping("/encaissement/ajouter")
	public String ajouter(Encaisser encaissement) { 
		
		encaissementService.save(encaissement);
		return"redirect:/encaissement";
	}
	
	@RequestMapping("encaissement/findById")
	@ResponseBody
	public Optional<Encaisser> findById(Integer id) {
		
		return encaissementService.findById(id);
	}
	
	@RequestMapping(value="encaissement/Modifier",method= {RequestMethod.PUT,RequestMethod.GET})
	public String Modifier(Encaisser encaissement) {
		
		encaissementService.save(encaissement);
		return"redirect:/encaissement";
		
	}
	
	@RequestMapping(value="encaissement/supprimer",method= {RequestMethod.DELETE,RequestMethod.GET})
	public String supprimer(Integer id) {
		
		encaissementService.delete(id);
		return"redirect:/encaissement";
		
	}

}
