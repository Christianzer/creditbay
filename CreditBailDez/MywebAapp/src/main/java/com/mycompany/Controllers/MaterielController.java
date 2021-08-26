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
import com.mycompany.models.Fournisseur;
import com.mycompany.models.Marque;
import com.mycompany.models.Materiel;
import com.mycompany.services.CategorieMaterielService;
import com.mycompany.services.FournisseurService;
import com.mycompany.services.MarqueService;
import com.mycompany.services.MaterielService;

@Controller
public class MaterielController {
	
	@Autowired
	private MaterielService materielService;
	@Autowired
	private CategorieMaterielService categoriematerielService;
	@Autowired
	private MarqueService marqueService;
	@Autowired
	private FournisseurService fournisseurService;
	
	@GetMapping("/materiel")
	public String getmateriel(Model model) {
		
		List<Materiel> materielList =materielService.getmateriel();
		List<CategorieMateriel> categoriematerielList =categoriematerielService.getcategoriemateriel();
		List<Marque> marqueList =marqueService.getmarque();
		List<Fournisseur> fournisseurList =fournisseurService.getfournisseur();
		
		model.addAttribute("materiels",materielList);
		model.addAttribute("categoriemateriels",categoriematerielList);
		model.addAttribute("marques",marqueList);
		model.addAttribute("fournisseurs", fournisseurList);
		
		return "Materiels";
		
	}
	
	@PostMapping("/materiel/ajouter")
	public String ajouter(Materiel materiel) {
		
		materielService.save(materiel);
		return"redirect:/materiel";
	}
	
	@RequestMapping("materiel/findById")
	@ResponseBody
	public Optional<Materiel> findById(Integer id) {
		
		return materielService.findById(id);
	}
	
	@RequestMapping(value="materiel/Modifier",method= {RequestMethod.PUT,RequestMethod.GET})
	public String Modifier(Materiel materiel) {
		
		materielService.save(materiel);
		return"redirect:/materiel";
		
	}
	
	@RequestMapping(value="materiel/supprimer",method= {RequestMethod.DELETE,RequestMethod.GET})
	public String supprimer(Integer id) {
		
		materielService.delete(id);
		return"redirect:/materiel";
		
	}

}
