package com.mycompany.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class OccupperController {
	
	@GetMapping("/occuper")
	public String getoccuper() {
		return "Occuper";
    }

}
