package com.fy.s4.initializingBeanAfter;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(Config.class);
        MsgInterface proxy = (MsgInterface) applicationContext.getBean("msg");
        proxy.test();
    }
}
