package com.programem.login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Pagina2Controller {

    @GetMapping("/Pagina2")
    public String Pagina2(){
        return "Pagina2";
    }
    
}