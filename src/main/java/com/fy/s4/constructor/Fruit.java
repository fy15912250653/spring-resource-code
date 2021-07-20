package com.fy.s4.constructor;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Fruit {

    private Apple apple;

    public Apple getApple() {
        return apple;
    }

    public Fruit() {
        System.out.println("Fruit 的无参构造方法");
    }

    @Autowired(required = false)
    public Fruit(Apple apple) {
        this.apple = apple;
        System.out.println("Fruit 的一参构造方法");
    }

    @Autowired(required = false)
    public Fruit(Apple apple, Object obj) {
        System.out.println("Fruit 的二参构造方法 2");
    }
    @Autowired(required = false)
    public Fruit(Apple apple, Apple apple3) {
        System.out.println("Fruit 的二参构造方法 1");
    }
}
