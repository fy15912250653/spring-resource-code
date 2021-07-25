package com.fy.s4.zz.generic;

import java.util.ArrayList;
import java.util.List;

public class Animal {
}
class Cat extends Animal{}


class  SmallCat extends  Cat{}


class AnimalTest{

    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        List<Cat> cats = new ArrayList<>();
        List<SmallCat> smallCats = new ArrayList<>();
        //show(animals);  todo 报错
        show(cats);
        show(smallCats);
    }

    /**
     * List<? extends Cat> list 只能传Cat类或者Cat的子类
     * @param list
     */
    public static void show(List<? extends Cat> list){
       /*
       todo 报错，因为此时不知道存的是具体类型的数据
       list.add(new Animal());
       list.add(new Cat());
       list.add(new SmallCat());
       */

        for (Cat cat : list) {
            System.out.println(cat);
        }
    }

}
class AnimalTest1{

    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        List<Cat> cats = new ArrayList<>();
        List<SmallCat> smallCats = new ArrayList<>();
        show1(animals);
        show1(cats);
       //  show1(smallCats);   todo 报错
    }


    /**
     * List<? super Cat> list 类型通配符的下限，要求集合只能是Cat或者Cat父类
     * @param list
     */
    public static void show1(List<? super Cat> list){

//       list.add(new Animal()); todo 报错
       // 下限通配符可以填充元素，但是不保证约束元素数据类型
       list.add(new Cat());
       list.add(new SmallCat());
       //
        for (Object o : list) {
            System.out.println(o);
        }
    }
}