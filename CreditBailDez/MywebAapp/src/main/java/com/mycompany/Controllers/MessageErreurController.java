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

import com.mycompany.models.MessageErreurs;
import com.mycompany.services.MessageErreurService;

@Controller
public class MessageErreurController {
	@Autowired
	private MessageErreurService messageerreurService;
	
	@GetMapping("/messageerreur")
	public String getmessageerreur(Model model) {
		
		List<MessageErreurs> messageerreurList =messageerreurService.getmessageerreur();
		model.addAttribute("messageerreurs",messageerreurList);
		
		return "MessageErreur";
		
	}
	
	@PostMapping("/messageerreur/ajouter")
	public String ajouter(MessageErreurs messageerreur) {
		
		messageerreurService.save(messageerreur);
		return"redirect:/messageerreur";
	}
	
	@RequestMapping("messageerreur/findById")
	@ResponseBody
	public Optional<MessageErreurs> findById(Integer id) {
		
		return messageerreurService.findById(id);
	}
	
	@RequestMapping(value="messageerreur/Modifier",method= {RequestMethod.PUT,RequestMethod.GET})
	public String Modifier(MessageErreurs messageerreur) {
		
		messageerreurService.save(messageerreur);
		return"redirect:/messageerreur";
		
	}
	
	@RequestMapping(value="messageerreur/supprimer",method= {RequestMethod.DELETE,RequestMethod.GET})
	public String supprimer(Integer id) {
		
		messageerreurService.delete(id);
		return"redirect:/messageerreur";
		
	}
}
