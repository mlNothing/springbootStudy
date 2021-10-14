package com.example.demo06.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

import java.util.Map;

/**
 * @author mlNothing
 * @date 2021/10/7 13:00
 */
public class ClassCondition implements Condition {
    /**
     * create by: mlNothing
     * description:
     * create time: 2021/10/7 19:18
     *  * @Param: context 上下文对象，用于获取环境，IOC容器，ClassLoader对象
     * @Param: metadata 注解原对象，可以用于获取注解定义的属性值
     * @return
     */

    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
//            boolean flag=true;
////        导入jedis的坐标
//        try {
//            Class<?> aClass = Class.forName("redis.clients.jedis.Jedis");
//        } catch (ClassNotFoundException e) {
//            flag=false;
//        }
//        return flag;
//        需要：通过导入的注解属性value值指定坐标后创建bean
//        获取属性值
        Map<String, Object> annotationAttributes1 = metadata.getAnnotationAttributes(ConditionOnClass.class.getName());
        System.out.println(annotationAttributes1);
        String[] value = (String[]) annotationAttributes1.get("value");
        boolean flag=true;
//        导入jedis的坐标
        for (String values : value) {
            try {
                Class<?> aClass = Class.forName(values);
            } catch (ClassNotFoundException e) {
                flag=false;
            }
        }
        return flag;
    }
}
