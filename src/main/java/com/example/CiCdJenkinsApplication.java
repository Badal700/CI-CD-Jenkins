package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CiCdJenkinsApplication {

    @GetMapping("/{name}")
    public String wishMsg(@PathVariable String name) {
        return "Hi "+name+", Your application is successfully deployed in Openshift through Jenkins.";
    }

    public static void main(String[] args) {
        SpringApplication.run(CiCdJenkinsApplication.class, args);
    }

}
