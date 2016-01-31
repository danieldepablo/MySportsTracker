package com.mst.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableAutoConfiguration
public class Application {
    @Value("${test.hello}")
    String name="a";

    @RequestMapping("/")
    public String home() {
        return "Hello World!"+name;
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}