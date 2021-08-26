package com.mycompany.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ConcernerController {
	
	@GetMapping("/concerner")
	public String getconcerner() {
		return "Concerner";
		
	}

}
