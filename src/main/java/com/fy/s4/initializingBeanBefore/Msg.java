package com.fy.s4.initializingBeanBefore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Msg  {
    private String text;
    public Msg() {
        System.out.println("msg 无参构造方法");
    }
    @Autowired
    public void setText(String text) {
        System.out.println("msg set()方法赋值");
        this.text = text;
    }
    @PostConstruct
    public void beforeInit(){
        System.out.println("初始化");
    }
}
