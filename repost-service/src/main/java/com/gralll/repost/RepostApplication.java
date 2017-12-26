package com.gralll.repost;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
//@EnableConfigurationProperties
@RestController
public class RepostApplication {
    public static void main(String[] args) {
        SpringApplication.run(RepostApplication.class, args);
    }

    @GetMapping("/hello")
    public String getSomething() {
        return "Hello";
    }
}