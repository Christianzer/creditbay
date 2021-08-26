package com.mycompany.Controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mycompany.models.Agent;
import com.mycompany.models.Fonction;
import com.mycompany.models.Genre;
import com.mycompany.models.SituationMatrimoniale;
import com.mycompany.services.AgentService;
import com.mycompany.services.FonctionService;
import com.mycompany.services.GenreService;
import com.mycompany.services.SituationMatrimonialeService;

@Controller
public class indexappController {
	
	@GetMapping("/index")
	public String getdeconnecter() {
		return "index";
		
	}
}
