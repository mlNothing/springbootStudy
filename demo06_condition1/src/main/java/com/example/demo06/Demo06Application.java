package com.example.demo06;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Demo06Application {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(Demo06Application.class, args);
//        Object person = context.getBean("person");
        Object person = context.getBean("person");
        System.out.println(person);
    }

}
