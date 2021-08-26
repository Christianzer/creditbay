package com.mycompany.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ConnecterController {
	
	@GetMapping("/connexion")
	public String getconnexion() {
		return "Connexion";
		
	}

}
