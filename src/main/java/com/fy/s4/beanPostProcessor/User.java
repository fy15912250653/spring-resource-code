package com.fy.s4.beanPostProcessor;

import org.springframework.stereotype.Component;

@Component
public class User {

    private String name;

    public User() {
        System.out.println("构造方法");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
