package com.example.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class 	Chapter7V2Application {

	public static void main(String[] args) {
		SpringApplication.run(Chapter7V2Application.class, args);
	}

}

//The issue is solved. Have to create packages in the package where the MainApplication class is located.
//So there is no need to use @ComponentScan annotation, so it will automatically scan all the packages in main package.