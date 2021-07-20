package com.fy.s4.instantiationBefore;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(Config.class);

        Apple apple = (Apple) applicationContext.getBean("apple");
        System.out.println("apple.getName() = " + apple.getName());
    }
}
