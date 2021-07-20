package com.fy.s4.initializingBean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class MyInstantiationAwareBeanPostProcessor implements InstantiationAwareBeanPostProcessor {

    @Override
    public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {
        if ("msg".equals(beanName)) {
            System.out.println("... msg对象创建完成之后，调用postProcessAfterInstantiation()实例化后方法");
        }
        return true;
    }
}
