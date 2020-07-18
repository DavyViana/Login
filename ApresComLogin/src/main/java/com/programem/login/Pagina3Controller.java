package com.programem.login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Pagina3Controller {

    @GetMapping("/Pagina3")
    public String Pagina3(){
        return "Pagina3";
    }
    
}