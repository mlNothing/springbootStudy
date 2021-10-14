package com.example.demo05_mybatis.mapper;

import com.example.demo05_mybatis.bean.person;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author mlNothing
 * @date 2021/10/7 11:51
 */
@Mapper
@Repository
public interface mapperUser {
    @Select("select * from person")
    public List<person> findAll();
}
