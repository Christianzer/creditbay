package com.mycompany.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UtilisateurController {
	
	@GetMapping("/utilisateur")
	public String getutilisateur() {

		return "Utilisateur";
    }

}
