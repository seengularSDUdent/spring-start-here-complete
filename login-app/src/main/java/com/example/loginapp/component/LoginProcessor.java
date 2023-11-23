package com.example.loginapp.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

@Component
@RequestScope
public class LoginProcessor {

    private String username;
    private String password;

    private LoggedUserManagementService loggedUserManagementService;

    @Autowired
    public void setLoggedUserManagementService(LoggedUserManagementService loggedUserManagementService) {
        this.loggedUserManagementService = loggedUserManagementService;
    }

    public boolean login(){

        String username = this.getUsername();
        String password = this.getPassword();

        if("Hannah".equals(username) && "password".equals(password)){
            loggedUserManagementService.setUsername(username);
            return true;
        }
        else{
            return false;
        }
    }

    public String getUsername(){
        return this.username;
    }

    public String getPassword(){
        return this.password;
    }

    public void setUsername(String username){
        this.username = username;
    }

    public void setPassword(String password){
        this.password = password;
    }
}
