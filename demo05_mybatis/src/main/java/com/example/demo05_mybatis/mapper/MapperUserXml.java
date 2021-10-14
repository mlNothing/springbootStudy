package com.example.demo05_mybatis.mapper;

import com.example.demo05_mybatis.bean.person;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author mlNothing
 * @date 2021/10/7 12:02
 */
@Mapper
@Repository
public interface MapperUserXml {
    public List<person> findAll1();
}
