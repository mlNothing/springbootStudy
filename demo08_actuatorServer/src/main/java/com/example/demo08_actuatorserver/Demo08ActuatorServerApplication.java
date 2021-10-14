package com.example.demo08_actuatorserver;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;

@EnableAdminServer
@SpringBootApplication
public class Demo08ActuatorServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(Demo08ActuatorServerApplication.class, args);
    }

}
