package com.fy.s3.annotationApplicationContext;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(Config.class);
        Obj obj = (Obj) applicationContext.getBean("obj");
        applicationContext.refresh();
        System.out.println(obj);
    }
}
