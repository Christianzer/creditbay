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

import com.mycompany.models.ScieteClient;
import com.mycompany.services.ScieteClientService;

@Controller
public class ScieteClientController {
	
	@Autowired
	private ScieteClientService scieteclientService;
	
	@GetMapping("/scieteclient")
	public String getscieteclient(Model model) {
		
		List<ScieteClient> scieteclientList =scieteclientService.getscieteclient();
		model.addAttribute("scieteclients",scieteclientList);
		
		return "SocieteClient";
		
	}
	
	@PostMapping("/scieteclient/ajouter")
	public String ajouter(ScieteClient scieteclient) {
		
		scieteclientService.save(scieteclient);
		return"redirect:/scieteclient";
	}
	
	@RequestMapping("scieteclient/findById")
	@ResponseBody
	public Optional<ScieteClient> findById(Integer id) {
		
		return scieteclientService.findById(id);
	}
	
	@RequestMapping(value="scieteclient/Modifier",method= {RequestMethod.PUT,RequestMethod.GET})
	public String Modifier(ScieteClient scieteclient) {
		
		scieteclientService.save(scieteclient);
		return"redirect:/scieteclient";
		
	}
	
	@RequestMapping(value="scieteclient/supprimer",method= {RequestMethod.DELETE,RequestMethod.GET})
	public String supprimer(Integer id) {
		
		scieteclientService.delete(id);
		return"redirect:/scieteclient";
		
	}



}
