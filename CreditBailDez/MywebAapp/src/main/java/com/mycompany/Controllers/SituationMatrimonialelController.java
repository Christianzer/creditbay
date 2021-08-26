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
import com.mycompany.services.SituationMatrimonialeService;

@Controller
public class SituationMatrimonialelController {
	
	@Autowired
	private SituationMatrimonialeService situationmatrimonialeService;
	
	@GetMapping("/situationmatrimoniale")
	public String getsituationmatrimoniale(Model model) {
		
		List<SituationMatrimoniale> situationmatrimonialeList =situationmatrimonialeService.getsituationmatrimoniale();
		model.addAttribute("situationmatrimoniales",situationmatrimonialeList);
		
		return "SituationMatrimoniale";
		
	}
	
	@PostMapping("/situationmatrimoniale/ajouter")
	public String ajouter(SituationMatrimoniale situationmatrimoniale) {
		
		situationmatrimonialeService.save(situationmatrimoniale);
		return"redirect:/situationmatrimoniale";
	}
	
	@RequestMapping("situationmatrimoniale/findById")
	@ResponseBody
	public Optional<SituationMatrimoniale> findById(Integer id) {
		
		return situationmatrimonialeService.findById(id);
	}
	
	@RequestMapping(value="situationmatrimoniale/Modifier",method= {RequestMethod.PUT,RequestMethod.GET})
	public String Modifier(SituationMatrimoniale situationmatrimoniale) {
		
		situationmatrimonialeService.save(situationmatrimoniale);
		return"redirect:/situationmatrimoniale";
		
	}
	
	@RequestMapping(value="situationmatrimoniale/supprimer",method= {RequestMethod.DELETE,RequestMethod.GET})
	public String supprimer(Integer id) {
		
		situationmatrimonialeService.delete(id);
		return"redirect:/situationmatrimoniale";
		
	}


}
