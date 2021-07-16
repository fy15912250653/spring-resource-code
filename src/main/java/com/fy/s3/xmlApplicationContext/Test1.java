package com.fy.s3.xmlApplicationContext;

import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Test1 {
    public static void main(String[] args) {
        FileSystemXmlApplicationContext fileSystemXmlApplicationContext =
                new FileSystemXmlApplicationContext("spring-s3-xmlApplicationContext.xml");
        Obj obj = (Obj) fileSystemXmlApplicationContext.getBean("obj");
        System.out.println(obj);
    }
}
