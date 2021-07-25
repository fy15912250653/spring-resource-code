package com.fy.s4.zz.generic;

/**
 *  todo 泛型类派生子类，子类也是泛型类，那么子类的泛型标识要和父类一致
 *
 */
public class Child1 extends Parent<String> {

    // todo 直接指定父类泛型类型
    public Child1(String value) {
        super(value);
    }
}
