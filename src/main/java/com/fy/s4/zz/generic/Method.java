package com.fy.s4.zz.generic;

import sun.net.idn.Punycode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Method<T> {

    // todo 泛型方法独立于泛型类,就算和类上面的泛型写的一样，同样没关系
    public <T> T getFirst(List<T> list) {
        return list.get(0);
    }

    // todo 泛型方法能加static修饰，泛型类的普通不能加static
 /*   public static void set(T t){

    }*/
    public static <K, T, V> void print(K k, T t, V v) {

    }

    /**
     * 泛型可变参数定义
     *
     * @param e
     * @param <E>
     */
    public static <E> void print(E... e) {
        for (E e1 : e) {
            System.out.println(e1);
        }
    }
}

class MethodTest {
    public static void main(String[] args) {
        Method<String> method = new Method();

        List<Integer> list = Arrays.asList(2, 1, 3);
        Integer first = method.getFirst(list);
        System.out.println(first);

        Method.print(Arrays.asList(10, 20, 30));
        Method.print(Arrays.asList("10", "20", "30"));
    }
}
