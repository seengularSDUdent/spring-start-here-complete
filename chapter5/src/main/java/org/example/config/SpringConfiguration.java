package org.example.config;

import org.example.service.JustSomeService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfiguration {

    @Bean
    JustSomeService justSomeService(){
        return new JustSomeService();
    }
}
