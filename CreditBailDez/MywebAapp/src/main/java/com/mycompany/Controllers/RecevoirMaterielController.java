package com.mycompany.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RecevoirMaterielController {
	
	@GetMapping("/recevoir")
	public String getrecevoir() {
		return "Recevoir";
    }

}
