package com.fy.s2.factoryBean;

import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {

        // todo  其他注入objFactoryBean的方式也可以，这里选用BeanDefinition的方式
        AbstractBeanDefinition beanDefinition = BeanDefinitionBuilder.genericBeanDefinition().getBeanDefinition();
        beanDefinition.setBeanClass(ObjFactoryBean.class);

        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        applicationContext.registerBeanDefinition("ob", beanDefinition);
        applicationContext.refresh();

        // todo 获取ObjFactoryBean中创建的bean对象
        System.out.println("ob获取的springBean：" + applicationContext.getBean("ob"));
        // todo 获取objFactoryBean对象
        System.out.println("&ob获取的springBean：" +applicationContext.getBean("&ob"));
    }
}
