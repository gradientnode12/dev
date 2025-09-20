package com.base.student.dev;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableScheduling
public class DevApplication  {

    @RestController
    class HelloworldController {
        @GetMapping("/")
        String hello() {
            return "Hello  tam mao!";
        }
    }

    public static void main(String[] args) {
        SpringApplication.run(DevApplication.class, args);
    }

}
