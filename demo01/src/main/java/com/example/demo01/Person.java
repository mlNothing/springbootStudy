package com.example.demo01;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author mlNothing
 * @date 2021/10/5 20:34
 */
@Component
@ConfigurationProperties(prefix = "person")
public class Person {

    private String name;
    private String age;

    public Person() {
    }

    public Person(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
