package com.fy.s1.javaBean;

/**
 * todo  一个javabean对象：1，属性私有化；2，对外提供get()，set()方法
 */
public class JavaBean {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
