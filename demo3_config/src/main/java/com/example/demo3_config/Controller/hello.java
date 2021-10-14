package com.example.demo3_config.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author mlNothing
 * @date 2021/10/6 21:40
 */
@RestController
public class hello {
    @RequestMapping("/hello")
    public String hello(){
        return "helloConfig";
    }
}
