package com.fy.s2.beanDifinition;

import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {

        AbstractBeanDefinition beanDefinition = BeanDefinitionBuilder.genericBeanDefinition().getBeanDefinition();
        beanDefinition.setBeanClass(Obj.class);

        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        applicationContext.registerBeanDefinition("obj", beanDefinition);
        applicationContext.registerBeanDefinition("obj", beanDefinition);
        applicationContext.refresh();

        Obj obj = (Obj) applicationContext.getBean("obj");
        System.out.println(obj);
    }
}
