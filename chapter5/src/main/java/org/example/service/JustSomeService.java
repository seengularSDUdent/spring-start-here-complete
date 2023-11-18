package org.example.service;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class JustSomeService {
    public JustSomeService(){
        System.out.println("The bean is created!");
    }
}
