package com.fy.s4.beanPostProcessor1;

import org.springframework.stereotype.Component;

@Component
public class User {

    @MyValue("fy")
    private String name;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
