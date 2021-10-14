package com.example.demo05_redis;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
class Demo05RedisApplicationTests {
    @Autowired
    private RedisTemplate redisTemplate;

    @Test
    void set() {
        redisTemplate.boundValueOps("name").set("zhangsan");
    }

    @Test
    void get(){
        Object name = redisTemplate.boundValueOps("name").get();
        System.out.println(name);
    }

}
