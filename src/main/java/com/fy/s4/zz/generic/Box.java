package com.fy.s4.zz.generic;

import com.fy.s3.singleton.Obj;

public class Box<T> {

    private T key;

    public Box(T key) {
        this.key = key;
    }

    public T getKey() {
        return key;
    }

    public void setKey(T key) {
        this.key = key;
    }
}

class BoxTest {
    public static void main(String[] args) {
        Box<Integer> b1 = new Box<>(100);
//       todo 虽然Integer是Number的子类，但是报错
//        showBox(b1);
        showBox1(b1);
        Box<Number> b2 = new Box<>(100);
        showBox(b2);
    }

    public static void showBox(Box<Number> b){
        System.out.println(b.getKey());
    }

    // todo 类型通配符
    public static void showBox1(Box<? extends Number> b){
        Number key = b.getKey();
        System.out.println(key);
    }
}