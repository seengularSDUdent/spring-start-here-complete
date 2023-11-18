package org.example.config;

import org.example.service.JustSomeService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration
@ComponentScan(basePackages = "org.example.service")
public class SpringConfiguration {

//    @Bean
//    @Lazy
//    JustSomeService justSomeService(){
//        return new JustSomeService();
//    }
}
