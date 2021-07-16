package com.fy.s3.applicationContext;

import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.io.Resource;

public class Test {
    public static void main(String[] args) {

        AbstractBeanDefinition beanDefinition = BeanDefinitionBuilder.genericBeanDefinition().getBeanDefinition();
        beanDefinition.setBeanClass(Obj.class);

        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        applicationContext.registerBeanDefinition("obj", beanDefinition);

        applicationContext.refresh();
        Obj obj = (Obj) applicationContext.getBean("obj");
        System.out.println(obj);

        // todo 获取系统环境变量
        System.out.println(applicationContext.getEnvironment().getSystemEnvironment());
        // todo 获取jvm环境变量
        System.out.println(applicationContext.getEnvironment().getPropertySources());
        // todo 获取资源
        Resource resource = applicationContext.getResource("D:\\myCode\\spring-source-code\\src\\main\\resources\\spring-s3-singleton.xml");
        System.out.println(resource);
    }
}
