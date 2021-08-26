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

import com.mycompany.models.SocieteAcquereuse;
import com.mycompany.services.SocieteAcquereuseService;

@Controller
public class SocieteAcquereuseController {
	
	@Autowired
	private SocieteAcquereuseService societeacquereuseService;
	
	@GetMapping("/societeacquereuse")
	public String getsocieteacquereuse(Model model) {
		
		List<SocieteAcquereuse> societeacquereuseList =societeacquereuseService.getsocieteacquereuse();
		model.addAttribute("societeacquereuses",societeacquereuseList);
		
		return "SocieteAqueureuse";
		
	}
	
	@PostMapping("/societeacquereuse/ajouter")
	public String ajouter(SocieteAcquereuse societeacquereuse) {
		
		societeacquereuseService.save(societeacquereuse);
		return"redirect:/societeacquereuse";
	}
	
	@RequestMapping("societeacquereuse/findById")
	@ResponseBody
	public Optional<SocieteAcquereuse> findById(Integer id) {
		
		return societeacquereuseService.findById(id);
	}
	
	@RequestMapping(value="societeacquereuse/Modifier",method= {RequestMethod.PUT,RequestMethod.GET})
	public String Modifier(SocieteAcquereuse societeacquereuse) {
		
		societeacquereuseService.save(societeacquereuse);
		return"redirect:/societeacquereuse";
		
	}
	
	@RequestMapping(value="societeacquereuse/supprimer",method= {RequestMethod.DELETE,RequestMethod.GET})
	public String supprimer(Integer id) {
		
		societeacquereuseService.delete(id);
		return"redirect:/societeacquereuse";
		
	}


}
