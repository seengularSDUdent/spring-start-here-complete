package com.example.loginapp.component;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

@Service
@SessionScope
public class LoggedUserManagementService {

    private String username;

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername(){
        return this.username;
    }
}
