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

import com.mycompany.models.GroupeUtilisateur;
import com.mycompany.services.GroupeUtilisateurService;

@Controller
public class GroupeUtilisateurController {


	@Autowired
	private GroupeUtilisateurService groupeutilisateurService;
	
	@GetMapping("/groupeutilisateur")
	public String getgroupeutilisateur(Model model) {
		
		List<GroupeUtilisateur> groupeutilisateurList =groupeutilisateurService.getgroupeutilisateur();
		model.addAttribute("groupeutilisateurs",groupeutilisateurList);
		
		return "GroupeUtilisateurs";
		
	}
	
	@PostMapping("/groupeutilisateur/ajouter")
	public String ajouter(GroupeUtilisateur groupeutilisateur) {
		
		groupeutilisateurService.save(groupeutilisateur);
		return"redirect:/groupeutilisateur";
	}
	
	@RequestMapping("groupeutilisateur/findById")
	@ResponseBody
	public Optional<GroupeUtilisateur> findById(Integer id) {
		
		return groupeutilisateurService.findById(id);
	}
	
	@RequestMapping(value="groupeutilisateur/Modifier",method= {RequestMethod.PUT,RequestMethod.GET})
	public String Modifier(GroupeUtilisateur groupeutilisateur) {
		
		groupeutilisateurService.save(groupeutilisateur);
		return"redirect:/groupeutilisateur";
		
	}
	
	@RequestMapping(value="groupeutilisateur/supprimer",method= {RequestMethod.DELETE,RequestMethod.GET})
	public String supprimer(Integer id) {
		
		groupeutilisateurService.delete(id);
		return"redirect:/groupeutilisateur";
		
	}

}
