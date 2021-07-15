package com.fy.s2.bean;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Config.class);
        AtBean atBean = (AtBean) applicationContext.getBean("atBean");
        System.out.println(atBean);
    }
}
