package com.dematic.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringAzureDemoAdvansysApplication {

    @GetMapping("/message")
    public String message(){
        return "Message #MF7";
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringAzureDemoAdvansysApplication.class, args);
    }

}
