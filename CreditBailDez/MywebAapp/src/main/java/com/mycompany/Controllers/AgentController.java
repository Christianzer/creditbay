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
import com.mycompany.models.Fonction;
import com.mycompany.models.Genre;
import com.mycompany.models.SituationMatrimoniale;
import com.mycompany.services.AgentService;
import com.mycompany.services.FonctionService;
import com.mycompany.services.GenreService;
import com.mycompany.services.SituationMatrimonialeService;

@Controller
public class AgentController {
	
	@Autowired
	private AgentService agentService;
	@Autowired
	private FonctionService fonctionService;
	@Autowired
	private GenreService genreService;
	@Autowired
	private SituationMatrimonialeService situationmatrimonialeService;
	
	@GetMapping("/agent")
	public String getagent(Model model) {
		
		List<Agent> agentList =agentService.getagent();
		List<Genre> genreList =genreService.getgenre();
		List<Fonction> fonctionList =fonctionService.getfonction();
		List<SituationMatrimoniale> situationmatrimonialeList =situationmatrimonialeService.getsituationmatrimoniale();
		
		model.addAttribute("agents",agentList);
		model.addAttribute("genres",genreList);
		model.addAttribute("fonctions",fonctionList);
		model.addAttribute("situationmatrimoniales", situationmatrimonialeList);
		
		return "Agent";
		
	}
	
	@PostMapping("/agent/ajouter")
	public String ajouter(Agent agent) {
		
		agentService.save(agent);
		return"redirect:/agent";
	}
	
	@RequestMapping("agent/findById")
	@ResponseBody
	public Optional<Agent> findById(Integer id) {
		
		return agentService.findById(id);
	}
	
	@RequestMapping(value="agent/Modifier",method= {RequestMethod.PUT,RequestMethod.GET})
	public String Modifier(Agent agent) {
		
		agentService.save(agent);
		return"redirect:/agent";
		
	}
	
	@RequestMapping(value="agent/supprimer",method= {RequestMethod.DELETE,RequestMethod.GET})
	public String supprimer(Integer id) {
		
		agentService.delete(id);
		return"redirect:/agent";
		
	}
}
