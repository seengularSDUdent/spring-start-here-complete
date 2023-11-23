package com.example.loginapp.component;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.ApplicationScope;

@Service
@ApplicationScope
public class LoginCountService {

    private int count;

    public void increment(){
        this.count++;
    }

    public int getCount(){
        return this.count;
    }
}
