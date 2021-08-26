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

import com.mycompany.models.CategorieMateriel;
import com.mycompany.services.CategorieMaterielService;

@Controller
public class CategorieMaterielController {
	
	@Autowired
	private CategorieMaterielService categoriematerielService;
	
	@GetMapping("/categoriemateriel")
	public String getcategoriemateriel(Model model) {
		
		List<CategorieMateriel> categoriematerielList =categoriematerielService.getcategoriemateriel();
		model.addAttribute("categoriemateriels",categoriematerielList);
		
		return "CategorieMateriels";
		
	}
	
	@PostMapping("/categoriemateriel/ajouter")
	public String ajouter(CategorieMateriel categoriemateriel) {
		
		categoriematerielService.save(categoriemateriel);
		return"redirect:/categoriemateriel";
	}
	
	@RequestMapping("categoriemateriel/findById")
	@ResponseBody
	public Optional<CategorieMateriel> findById(Integer id) {
		
		return categoriematerielService.findById(id);
	}
	
	@RequestMapping(value="categoriemateriel/Modifier",method= {RequestMethod.PUT,RequestMethod.GET})
	public String Modifier(CategorieMateriel categoriemateriel) {
		
		categoriematerielService.save(categoriemateriel);
		return"redirect:/categoriemateriel";
		
	}
	
	@RequestMapping(value="categoriemateriel/supprimer",method= {RequestMethod.DELETE,RequestMethod.GET})
	public String supprimer(Integer id) {
		
		categoriematerielService.delete(id);
		return"redirect:/categoriemateriel";
		
	}

}
