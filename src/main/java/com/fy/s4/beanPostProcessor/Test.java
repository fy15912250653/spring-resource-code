package com.fy.s4.beanPostProcessor;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(Config.class);

        User user = (User) applicationContext.getBean("user");
    }
}
