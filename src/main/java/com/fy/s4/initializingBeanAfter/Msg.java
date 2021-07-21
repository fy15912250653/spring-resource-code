package com.fy.s4.initializingBeanAfter;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Msg  implements MsgInterface{
    public Msg() {
        System.out.println("msg 无参构造方法");
    }
    @PostConstruct
    public void beforeInit(){
        System.out.println("初始化");
    }
    @Override
    public void test() {
        System.out.println("业务逻辑");
    }
}
