package com.fy.s3.singleton;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-s3-singleton.xml");

        Obj singletonObj = (Obj) applicationContext.getBean("singletonObj");
        Obj singletonObj1 = (Obj) applicationContext.getBean("singletonObj");
        System.out.println("单例bean创建两次是否是同一对象 ：" + (singletonObj == singletonObj1)); // true
        Obj singletonIsLazyObj = (Obj) applicationContext.getBean("singletonIsLazyObj");
        Obj singletonIsLazyObj1 = (Obj) applicationContext.getBean("singletonIsLazyObj");
        System.out.println("单例bean懒加载创建两次是否是同一对象 ：" + (singletonIsLazyObj == singletonIsLazyObj1)); // true
        Obj prototypeObj = (Obj) applicationContext.getBean("prototypeObj");
        Obj prototypeObj1 = (Obj) applicationContext.getBean("prototypeObj");
        System.out.println("单例bean懒加载创建两次是否是同一对象 ：" + (prototypeObj == prototypeObj1)); // false

    }
}
