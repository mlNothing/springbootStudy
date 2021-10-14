package com.example.demo06.config;

import com.example.demo06.bean.Person;
import com.example.demo06.condition.ClassCondition;
import com.example.demo06.condition.ConditionOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * @author mlNothing
 * @date 2021/10/7 12:49
 */
@Configuration
public class PersonConfig {
    /**
     * create by: mlNothing
     * description: 当jedis注入的时候导入依赖，不注入时不导入依赖 
     * create time: 2021/10/7 12:53
     *  * @Param: null
     * @return 
     */
     
//    @Bean
//    @Conditional(ClassCondition.class)
//    @ConditionOnClass("redis.clients.jedis.Jedis")
//    @ConditionOnClass("com.alibaba.fastjson.JSON")
//    public Person person(){
//
//        return  new Person();
//    }

/**
 * create by: mlNothing
 * description: 其实上面那些不需要我们配置，可以直接使用
 * create time: 2021/10/7 20:13
 *  * @Param: null
 * @return
 */

    @Bean
    @ConditionalOnProperty(name = "lml",havingValue = "lml")
    public Person person(){

        return  new Person();
    }
}
