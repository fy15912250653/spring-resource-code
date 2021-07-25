package com.fy.s4.zz.generic;

public class Test {

    public static void main(String[] args) {
        GenericClass<String> strGenericClass = new GenericClass<>("abc");
        System.out.println("strGenericClass.getKey() = " + strGenericClass.getKey());

        GenericClass<Integer> intGenericClass = new GenericClass<>(100);
        System.out.println("intGenericClass.getKey() = " + intGenericClass.getKey());

        // todo 泛型对象创建时没指定类型，按Object创建
        GenericClass genericClass = new GenericClass("TEST");
        Object key = genericClass.getKey();
        System.out.println(" genericClass.getKey() = " + key);

        // todo 泛型类不支持基础数据类型
        //  GenericClass<int> intGenericClass1 = new GenericClass<>(100);

        System.out.println(strGenericClass.getClass());
        System.out.println(intGenericClass.getClass());
        // 同一泛型类，根据不同的数据类型创建对象，本质上是同一类型
        System.out.println(strGenericClass.getClass() == intGenericClass.getClass()); // true
    }
}
