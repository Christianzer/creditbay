package com.mycompany.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class indexcomptaController {
	
	@GetMapping("/compta")
	public String getcompta() {
		return "indexCompta";
		
	}

}
