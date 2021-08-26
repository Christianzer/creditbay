package com.mycompany.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DeconnecterController {
	
	@GetMapping("/deconnecter")
	public String getdeconnecter() {
		return "Deconnecter";
		
	}

}
