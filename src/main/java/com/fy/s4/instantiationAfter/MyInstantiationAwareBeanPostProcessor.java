package com.fy.s4.instantiationAfter;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class MyInstantiationAwareBeanPostProcessor implements InstantiationAwareBeanPostProcessor {

    @Override
    public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {
        if ("fruit".equals(beanName)) {
            System.out.println("... fruit对象创建完成之后，调用postProcessAfterInstantiation()方法");
        }
        return false;
    }
}
