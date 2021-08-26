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

import com.mycompany.models.Banque;
import com.mycompany.services.BanqueService;

@Controller
public class BanqueController {
	
	@Autowired
	private BanqueService banqueService;
	
	@GetMapping("/banque")
	public String getbanque(Model model) {
		
		List<Banque> banqueList =banqueService.getbanque();
		model.addAttribute("banques",banqueList);
		
		return "Banque";
		
	}
	
	@PostMapping("/banque/ajouter")
	public String ajouter(Banque banque) {
		
		banqueService.save(banque);
		return"redirect:/banque";
	}
	
	@RequestMapping("banque/findById")
	@ResponseBody
	public Optional<Banque> findById(Integer id) {
		
		return banqueService.findById(id);
	}
	
	@RequestMapping(value="banque/Modifier",method= {RequestMethod.PUT,RequestMethod.GET})
	public String Modifier(Banque banque) {
		
		banqueService.save(banque);
		return"redirect:/banque";
		
	}
	
	@RequestMapping(value="banque/supprimer",method= {RequestMethod.DELETE,RequestMethod.GET})
	public String supprimer(Integer id) {
		
		banqueService.delete(id);
		return"redirect:/banque";
		
	}


}
