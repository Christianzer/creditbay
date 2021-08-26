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


import com.mycompany.models.SituationMatrimoniale;
import com.mycompany.models.Genre;
import com.mycompany.models.ScieteClient;
import com.mycompany.models.Client;
import com.mycompany.services.SituationMatrimonialeService;
import com.mycompany.services.GenreService;
import com.mycompany.services.ScieteClientService;
import com.mycompany.services.ClientService;

@Controller
public class ClientController {
	
	@Autowired
	private ClientService clientService;
	@Autowired
	private ScieteClientService scieteclientService;
	@Autowired
	private GenreService genreService;
	@Autowired
	private SituationMatrimonialeService situationmatrimonialeService;
	
	@GetMapping("/client")
	public String getclient(Model model) {
		
		List<Client> clientList =clientService.getclient();
		List<Genre> genreList =genreService.getgenre();
		List<ScieteClient> scieteclientList =scieteclientService.getscieteclient();
		List<SituationMatrimoniale> situationmatrimonialeList =situationmatrimonialeService.getsituationmatrimoniale();
		
		model.addAttribute("clients",clientList);
		model.addAttribute("genres",genreList);
		model.addAttribute("scieteclients",scieteclientList);
		model.addAttribute("situationmatrimoniales", situationmatrimonialeList);
		
		return "Client";
		
	}
	
	@PostMapping("/client/ajouter")
	public String ajouter(Client client) {
		
		clientService.save(client);
		return"redirect:/client";
	}
	
	@RequestMapping("client/findById")
	@ResponseBody
	public Optional<Client> findById(Integer id) {
		
		return clientService.findById(id);
	}
	
	@RequestMapping(value="client/Modifier",method= {RequestMethod.PUT,RequestMethod.GET})
	public String Modifier(Client client) {
		
		clientService.save(client);
		return"redirect:/client";
		
	}
	
	@RequestMapping(value="client/supprimer",method= {RequestMethod.DELETE,RequestMethod.GET})
	public String supprimer(Integer id) {
		
		clientService.delete(id);
		return"redirect:/client";
		
	}

}
