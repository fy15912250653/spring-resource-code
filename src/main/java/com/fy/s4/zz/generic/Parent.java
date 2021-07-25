package com.fy.s4.zz.generic;

public class Parent<T> {
    private T value;

    public Parent(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
