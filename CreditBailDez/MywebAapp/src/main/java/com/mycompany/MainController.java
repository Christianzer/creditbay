package com.mycompany;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path="/utilisateur")
public class MainController {

    @GetMapping(path="/utlisateur")
    public String admin(){
        return "utilisateur";
    }
}
