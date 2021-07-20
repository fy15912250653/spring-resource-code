package com.fy.s4.instantiationBefore;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class MyInstantiationAwareBeanPostProcessor implements InstantiationAwareBeanPostProcessor {
    @Override
    public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {
        if ("apple".equals(beanName)) {
            System.out.println("----------- beforeInstantiation -----------");
            Apple apple =new Apple();
            apple.setName("abc");
            return apple;
        }
        return null;
    }

}
