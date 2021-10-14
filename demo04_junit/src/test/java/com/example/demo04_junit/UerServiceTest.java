package com.example.demo04_junit;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author mlNothing
 * @date 2021/10/6 23:27
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = Demo04JunitApplication.class )
public class UerServiceTest {
    @Autowired
    private  UserService userService;
    @Test
    public  void one(){
        userService.add();
    }
}
