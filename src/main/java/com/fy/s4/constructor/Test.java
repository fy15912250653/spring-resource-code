package com.fy.s4.constructor;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(Config.class);

        Fruit fruit = applicationContext.getBean("fruit", Fruit.class);
        Apple apple = applicationContext.getBean("apple", Apple.class);

    }
}
