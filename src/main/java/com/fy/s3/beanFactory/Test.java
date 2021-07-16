package com.fy.s3.beanFactory;

import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;

public class Test {
    public static void main(String[] args) {

        // todo 用beanFactory创建bean方法1：使用beanDefinition创建
        AbstractBeanDefinition beanDefinition = BeanDefinitionBuilder.genericBeanDefinition().getBeanDefinition();
        beanDefinition.setBeanClass(Obj.class);

        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();

        beanFactory.registerBeanDefinition("obj1", beanDefinition);

        // todo 用beanFactory创建bean方法2：使用registerSingleton创建
        beanFactory.registerSingleton("obj", new Obj());
        Obj obj = beanFactory.getBean("obj", Obj.class);
        Obj obj1 = beanFactory.getBean("obj1", Obj.class);
        System.out.println(obj);
        System.out.println(obj1);
    }
}
