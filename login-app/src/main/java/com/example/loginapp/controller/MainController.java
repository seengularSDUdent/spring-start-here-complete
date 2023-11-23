package com.example.loginapp.controller;

import com.example.loginapp.component.LoginProcessor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    @GetMapping("/")
    public String getLogin(){
        return "login.html";
    }

    @PostMapping("/")
    public String postLogin(Model model, @RequestParam String login, @RequestParam String password, LoginProcessor loginProcessor){

        loginProcessor.setUsername(login);
        loginProcessor.setPassword(password);

        boolean loggedIn = loginProcessor.login();

        if(loggedIn){
            model.addAttribute("message", "You are logged in now!");
        }
        else{
            model.addAttribute("message", "You are not logged in");
        }

        return "login.html";
    }
}
