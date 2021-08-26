package com.mycompany.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class indexcommercialController {
	
	@GetMapping("/commercial")
	public String getcommercial() {
		return "indexCommerciale";
		
	}

}
