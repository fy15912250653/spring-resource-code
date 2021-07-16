package com.fy.s3.xmlApplicationContext;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext =
                new ClassPathXmlApplicationContext("spring-s3-xmlApplicationContext.xml");

        Obj obj = (Obj) classPathXmlApplicationContext.getBean("obj");
        ConfigurableListableBeanFactory beanFactory = classPathXmlApplicationContext.getBeanFactory();
        classPathXmlApplicationContext.refresh();
        Obj obj1 = (Obj) classPathXmlApplicationContext.getBean("obj");
        ConfigurableListableBeanFactory beanFactory1 = classPathXmlApplicationContext.getBeanFactory();

        System.out.println("application refresh 前obj内存地址：" + obj);
        System.out.println("application refresh 后obj内存地址：" + obj1);
        System.out.println("application refresh 前beanFactory内存地址：" + beanFactory);
        System.out.println("application refresh 后beanFactory内存地址：" + beanFactory1);

    }
}
