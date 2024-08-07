package com.abhi.scm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class TestController {

    @GetMapping("/wellcome")
    public String wellComeMsg(){
        return "Wellcome to Smart Contact Manager";
    }

    @RequestMapping("/home/{name}")
    public String home(Model model,@PathVariable String name){
        model.addAttribute("name", name);
        return "home";
    }

}
