package com.fy.s4.beanPostProcessor1;


import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

import java.lang.reflect.Field;

@Component
public class MyBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        return null;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        Class<?> cls = bean.getClass();
        for (Field field : cls.getDeclaredFields()) {
            if(field.isAnnotationPresent(MyValue.class)){
                MyValue annotation = field.getAnnotation(MyValue.class);
                field.setAccessible(true);
                try {
                    field.set(bean,annotation.value());
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
        return null;
    }
}
