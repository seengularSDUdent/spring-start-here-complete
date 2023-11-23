package com.example.loginapp.controller;

import com.example.loginapp.component.LoggedUserManagementService;
import com.example.loginapp.component.LoginProcessor;
import org.apache.juli.logging.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    private final LoginProcessor loginProcessor;

    public LoginController(LoginProcessor loginProcessor){
        this.loginProcessor = loginProcessor;
    }

    private LoggedUserManagementService loggedUserManagementService;

    @Autowired
    public void setLoggedUserManagementService(LoggedUserManagementService loggedUserManagementService) {
        this.loggedUserManagementService = loggedUserManagementService;
    }

    @GetMapping("/")
    public String getLogin(){
        return "login.html";
    }

    @PostMapping("/")
    public String postLogin(Model model, @RequestParam String login, @RequestParam String password){

        loginProcessor.setUsername(login);
        loginProcessor.setPassword(password);

        boolean loggedIn = loginProcessor.login();

        if(loggedIn){
            return "redirect:/main";
        }

        model.addAttribute("message", "Login Failed");
        return "login.html";
    }
}
