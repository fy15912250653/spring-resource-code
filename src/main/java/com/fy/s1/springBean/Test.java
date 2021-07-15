package com.fy.s1.springBean;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        // todo spring生成的对象就是springBean
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-s1-springBean.xml");
        SpringBean springBean = (SpringBean) applicationContext.getBean("springBean");
        System.out.println(springBean);
    }
}
