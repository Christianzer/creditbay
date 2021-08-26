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

import com.mycompany.models.OptionAchat;
import com.mycompany.services.OptionAchatService;

@Controller
public class OPtionAchatController {
	
	@Autowired
	private OptionAchatService optionachatService;
	
	@GetMapping("/optionachat")
	public String getoptionachat(Model model) {
		
		List<OptionAchat> optionachatList =optionachatService.getoptionachat();
		model.addAttribute("optionachats",optionachatList);
		
		return "OptionAchat";
		
	}
	
	@PostMapping("/optionachat/ajouter")
	public String ajouter(OptionAchat optionachat) {
		
		optionachatService.save(optionachat);
		return"redirect:/optionachat";
	}
	
	@RequestMapping("optionachat/findById")
	@ResponseBody
	public Optional<OptionAchat> findById(Integer id) {
		
		return optionachatService.findById(id);
	}
	
	@RequestMapping(value="optionachat/Modifier",method= {RequestMethod.PUT,RequestMethod.GET})
	public String Modifier(OptionAchat optionachat) {
		
		optionachatService.save(optionachat);
		return"redirect:/optionachat";
		
	}
	
	@RequestMapping(value="optionachat/supprimer",method= {RequestMethod.DELETE,RequestMethod.GET})
	public String supprimer(Integer id) {
		
		optionachatService.delete(id);
		return"redirect:/optionachat";
		
	}

}
