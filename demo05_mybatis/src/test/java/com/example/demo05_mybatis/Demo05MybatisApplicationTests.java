package com.example.demo05_mybatis;

import com.example.demo05_mybatis.bean.person;

import com.example.demo05_mybatis.mapper.MapperUserXml;
import com.example.demo05_mybatis.mapper.mapperUser;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
class Demo05MybatisApplicationTests {
    @Autowired
    private mapperUser mapperUser;
    @Autowired
    private MapperUserXml userXml;
    @Test
    void testFindAll() {
        List<person> all = mapperUser.findAll();
        for (person person : all) {
            System.out.println(person);
        }
    }


    @Test
    void testFindAll1() {
        List<person> all = userXml.findAll1();
        for (person person : all) {
            System.out.println(person);
        }
    }


}
