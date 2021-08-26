package com.mycompany.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class indexRhController {
	
	@GetMapping("/rh")
	public String getrh() {
		return "indexRh";
		
	}

}
