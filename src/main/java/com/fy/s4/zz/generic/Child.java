package com.fy.s4.zz.generic;

/**
 *  todo 泛型类派生子类，子类也是泛型类，那么子类的泛型标识要和父类一致
 *
 * @param <T>
 */
public class Child<T,K,V> extends Parent<T> {
    public Child(T value) {
        super(value);
    }

    // todo 可以对子类进行泛型扩展
    private K key;
    private V val;
}
