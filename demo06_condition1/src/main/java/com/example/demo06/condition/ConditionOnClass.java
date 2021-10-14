package com.example.demo06.condition;

import org.springframework.context.annotation.Conditional;

import java.lang.annotation.*;

/**
 * @author mlNothing
 * @date 2021/10/7 19:12
 */
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Conditional(ClassCondition.class)
public @interface ConditionOnClass {
    String[] value();
}
