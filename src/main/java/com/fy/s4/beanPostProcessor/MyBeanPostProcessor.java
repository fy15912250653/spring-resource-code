package com.fy.s4.beanPostProcessor;


import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class MyBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("后置处理器 postProcessBeforeInitialization()方法执行：" + bean.getClass());
        return null;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("            后置处理器 postProcessAfterInitialization()方法执行：" + bean.getClass());
        return null;
    }
}
