package com.fy.s4.zz.generic;

/**
 * 泛型类的定义
 * @param <T> 泛型标识 —— 类型形参 T在创建对象的时候指定数据类型
 */
public class GenericClass<T> {
    // T 由外部指定
    private T key;

    public GenericClass(T key) {
        this.key = key;
    }

    public T getKey() {
        return key;
    }

    public void setKey(T key) {
        this.key = key;
    }
}
