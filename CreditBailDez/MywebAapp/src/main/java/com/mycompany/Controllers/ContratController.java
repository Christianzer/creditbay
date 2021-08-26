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
import com.mycompany.models.Materiel;
import com.mycompany.models.OptionAchat;
import com.mycompany.models.Periode;
import com.mycompany.services.AgentService;
import com.mycompany.services.ClientService;
import com.mycompany.services.ContratService;
import com.mycompany.services.MaterielService;
import com.mycompany.services.OptionAchatService;
import com.mycompany.services.PeriodeService;


@Controller
public class ContratController {
	@Autowired
	private ContratService contratService;
	@Autowired
	private ClientService clientService;
	@Autowired
	private MaterielService materielService;
	@Autowired
	private AgentService agentService;
	@Autowired
	private OptionAchatService optionachatService;
	@Autowired
	private PeriodeService periodeService;
	
	@GetMapping("/contrat")
	public String getcontrat(Model model) {
		
		List<Contrat> contratList =contratService.getcontrat();
		List<Client> clientList =clientService.getclient();
		List<Agent> agentList =agentService.getagent();
		List<Materiel> materielList =materielService.getmateriel();
		List<OptionAchat> optionachatList =optionachatService.getoptionachat();
		List<Periode> periodeList =periodeService.getperiode();
		
		model.addAttribute("contrats",contratList);
		model.addAttribute("clients",clientList);
		model.addAttribute("agents",agentList);
		model.addAttribute("materiels", materielList);
		model.addAttribute("optionachats", optionachatList);
		model.addAttribute("periodes", periodeList);
		
		return "Contrat";
		
	}
	
	@PostMapping("/contrat/ajouter")
	public String ajouter(Contrat contrat) { 
		
		contratService.save(contrat);
		return"redirect:/contrat";
	}
	
	@RequestMapping("contrat/findById")
	@ResponseBody
	public Optional<Contrat> findById(Integer id) {
		
		return contratService.findById(id);
	}
	
	@RequestMapping(value="contrat/Modifier",method= {RequestMethod.PUT,RequestMethod.GET})
	public String Modifier(Contrat contrat) {
		
		contratService.save(contrat);
		return"redirect:/contrat";
		
	}
	
	@RequestMapping(value="contrat/supprimer",method= {RequestMethod.DELETE,RequestMethod.GET})
	public String supprimer(Integer id) {
		
		contratService.delete(id);
		return"redirect:/contrat";
		
	}



}
