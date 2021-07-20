package com.fy.s4.initializingBean;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Msg implements InitializingBean {

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
        System.out.println("初始化方法2");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("msg 实现了InitializingBean接口" +
                "重写afterPropertiesSet()方法，完成初始化方法。" +
                "通常在这个方法中校验属性值是否符合预期。text = " + text);
    }
}
