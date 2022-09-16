package com.example.apistarwars;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import reactivefeign.spring.config.EnableReactiveFeignClients;

@SpringBootApplication
@EnableReactiveFeignClients
public class ApiStarwarsApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiStarwarsApplication.class, args);
        System.out.println("WEB FLUX consumindo  api StarWars");
    }

}
