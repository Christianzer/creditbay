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

import com.mycompany.models.Periode;
import com.mycompany.services.PeriodeService;

@Controller
public class PeriodeController {
	
	@Autowired
	private PeriodeService periodeService;
	
	@GetMapping("/periode")
	public String getperiode(Model model) {
		
		List<Periode> periodeList =periodeService.getperiode();
		model.addAttribute("periodes",periodeList);
		
		return "Periode";
		
	}
	
	@PostMapping("/periode/ajouter")
	public String ajouter(Periode periode) {
		
		periodeService.save(periode);
		return"redirect:/periode";
	}
	
	@RequestMapping("periode/findById")
	@ResponseBody
	public Optional<Periode> findById(Integer id) {
		
		return periodeService.findById(id);
	}
	
	@RequestMapping(value="periode/Modifier",method= {RequestMethod.PUT,RequestMethod.GET})
	public String Modifier(Periode periode) {
		
		periodeService.save(periode);
		return"redirect:/periode";
		
	}
	
	@RequestMapping(value="periode/supprimer",method= {RequestMethod.DELETE,RequestMethod.GET})
	public String supprimer(Integer id) {
		
		periodeService.delete(id);
		return"redirect:/periode";
		
	}

}
