package com.fy.s4.instantiationBefore;

import org.springframework.stereotype.Component;

@Component
public class Apple {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Apple() {
        System.out.println("apple 构造方法");
    }
}
