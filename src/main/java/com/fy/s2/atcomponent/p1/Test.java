package com.fy.s2.atcomponent.p1;


import com.fy.s2.atcomponent.p2.Obj2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ComponentConfig.class);

        Obj obj = (Obj) applicationContext.getBean("obj");
        System.out.println(obj);
        Obj2 obj2 = (Obj2) applicationContext.getBean("obj2");
        System.out.println(obj2);
    }
}
