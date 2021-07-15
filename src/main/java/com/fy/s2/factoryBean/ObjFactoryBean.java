package com.fy.s2.factoryBean;


import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

@Component
public class ObjFactoryBean implements FactoryBean {

    public Obj getObject() throws Exception {
        Obj obj = new Obj();
        System.out.println("ObjFactoryBean 中生成的springBean对象：" + obj);
        return obj;
    }

    public Class<?> getObjectType() {
        return Obj.class;
    }
}
