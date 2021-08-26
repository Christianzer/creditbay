package com.mycompany.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RattacherController {
	
	@GetMapping("/rattacher")
	public String getrattacher() {
		return "Rattacher";
    }

}
