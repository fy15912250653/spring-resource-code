package com.fy.s2.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-s2-xml.xml");
        XmlObj xmlObj = (XmlObj) applicationContext.getBean("xmlObj");
        System.out.println(xmlObj);
    }
}
