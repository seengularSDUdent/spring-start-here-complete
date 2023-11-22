package com.example.chapter8.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    @RequestMapping("/home")
    public String home(Model page){
        page.addAttribute("name", "Kamila");
        page.addAttribute("color", "blue");
        return "home.html";
    }
}
