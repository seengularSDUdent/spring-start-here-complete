package com.example.chapter8.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    @RequestMapping("/home")
    public String home(@RequestParam(required = false) String color, Model page, @RequestParam String name){
        page.addAttribute("name", name);
        page.addAttribute("color", color);
        return "home.html";
    }

    @RequestMapping("home/{name}/{color}")
    public String home2(@PathVariable String name, @PathVariable String color, Model page){
        page.addAttribute("name", name);
        page.addAttribute("color", color);
        return "home.html";
    }
}
