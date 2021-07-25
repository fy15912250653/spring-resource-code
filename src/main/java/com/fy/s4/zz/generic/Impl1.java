package com.fy.s4.zz.generic;

public class Impl1<T,E> implements GenInterface<T> {

    private T t;
    private E e;

    public Impl1(T t, E e) {
        this.t = t;
        this.e = e;
    }

    @Override
    public T getKey() {
        return t;
    }

    public E getE() {
        return e;
    }
}
