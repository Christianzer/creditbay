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

import com.mycompany.models.TypeUtilisateurs;
import com.mycompany.services.TypeUtilisateurService;

@Controller
public class TypeUtillisateurController {
	
	@Autowired
	private TypeUtilisateurService typeutilisateurService;
	
	@GetMapping("/typeutilisateur")
	public String gettypeutilisateur(Model model) {
		
		List<TypeUtilisateurs> typeutilisateurList =typeutilisateurService.gettypeutilisateur();
		model.addAttribute("typeutilisateurs",typeutilisateurList);
		
		return "TypeUtilisateur";
		
	}
	
	@PostMapping("/typeutilisateur/ajouter")
	public String ajouter(TypeUtilisateurs typeutilisateur) { 
		
		typeutilisateurService.save(typeutilisateur);
		return"redirect:/typeutilisateur";
	}
	
	@RequestMapping("typeutilisateur/findById")
	@ResponseBody
	public Optional<TypeUtilisateurs> findById(Integer id) {
		
		return typeutilisateurService.findById(id);
	}
	
	@RequestMapping(value="typeutilisateur/Modifier",method= {RequestMethod.PUT,RequestMethod.GET})
	public String Modifier(TypeUtilisateurs typeutilisateur) {
		
		typeutilisateurService.save(typeutilisateur);
		return"redirect:/typeutilisateur";
		
	}
	
	@RequestMapping(value="typeutilisateur/supprimer",method= {RequestMethod.DELETE,RequestMethod.GET})
	public String supprimer(Integer id) {
		
		typeutilisateurService.delete(id);
		return"redirect:/typeutilisateur";
		
	}

}
