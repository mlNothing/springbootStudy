package com.example.demo01.controller;

import com.example.demo01.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author mlNothing
 * @date 2021/10/5 19:12
 */
@RestController
public class Controller {

    @Value("${person.name}")
    private String name;


    @Value("${person1.name}")
    private String name1;
    
    @Value("${address[0]}")
    private String add1;
//    可以获取所有的
    @Autowired
    private Environment env;
@Autowired
    private Person person;

    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }

    /**
     * @return String
     */
    @RequestMapping("/hello1")
    public String hello1(){
        System.out.println(name);
        return "hello";
    }
/**
 * create by: mlNothing
 * description:
 * create time: 2021/10/5 20:18
 *
  * @Param: null
 * @return
 */
    @RequestMapping("/hello2")
    public String hello2(){
        System.out.println(name1);
        return "hello";
    }
/**
 * create by: mlNothing
 * description: 
 * create time: 2021/10/5 20:20
 * 
  * @Param: null
 * @return 
 */

    @RequestMapping("/hello3")
    public String hello3(){
        System.out.println(add1);
        System.out.println(env.getProperty("person.name"));
        return "hello";
    }

    @RequestMapping("/hello4")
    public String hello4(){
        System.out.println(person.getName());
        System.out.println(person.getAge());
        return "hello";
    }

}
