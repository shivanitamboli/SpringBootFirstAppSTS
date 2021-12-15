package com.example.springbootfirstappsts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootFirstAppStsApplication<HelloWorld1Application> {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootFirstAppStsApplication.class, args);
    }
    System.out.println("Hello from Bridgelabz");
    SpringApplication.run(HelloWorld1Application.class, args);
}
