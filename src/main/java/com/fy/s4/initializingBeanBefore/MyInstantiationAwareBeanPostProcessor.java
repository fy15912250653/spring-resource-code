package com.fy.s4.initializingBeanBefore;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class MyInstantiationAwareBeanPostProcessor implements InstantiationAwareBeanPostProcessor {
    @Override
    public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {
        if ("msg".equals(beanName)) {
            System.out.println("... 实例化对象前");
        }
        return null;
    }
    @Override
    public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {
        if ("msg".equals(beanName)) {
            System.out.println("... 实例化对象后");
        }
        return true;
    }
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if ("msg".equals(beanName)) {
            System.out.println(">>> 初始化前");
        }
        return bean;
    }
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if ("msg".equals(beanName)) {
            System.out.println(">>> 初始化后");
        }
        return null;
    }
}
