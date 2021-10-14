package com.example.ddemo08_actuator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
 * create by: mlNothing
 * description: 运行方式： http://localhost:8080/actuator
 * 健康相关的：http://localhost:8080/actuator/health
 * create time: 2021/10/13 11:06
 *  * @Param: null
 * @return
 */
 
@SpringBootApplication
public class Ddemo08ActuatorApplication {

    public static void main(String[] args) {
        SpringApplication.run(Ddemo08ActuatorApplication.class, args);
    }

}
