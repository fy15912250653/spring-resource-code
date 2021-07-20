package com.fy.s4.instantiationAfter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Fruit {

    private Apple apple;

    public Apple getApple() {
        return apple;
    }

    @Autowired
    public void setApple(Apple apple) {
        this.apple = apple;
        System.out.println("fruit set()方法赋值");
    }

    public Fruit() {
        System.out.println("Fruit 的无参构造方法");
    }
}
