package org.example.main;

import org.example.config.SpringConfiguration;
import org.example.service.JustSomeService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfiguration.class);

//        JustSomeService object0 = context.getBean(JustSomeService.class);
//        JustSomeService object1 = context.getBean(JustSomeService.class);
//
//        System.out.println(object0 == object1);
    }
}