package com.fy.s2.supplier;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.function.Supplier;

public class Test {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();

        // todo 只传入一个class对象，那么创建该对象里面属性为空
        applicationContext.registerBean(Person.class);
        // todo 传入一个class对象和Supplier实现，可以自定义对象属性值
        applicationContext.registerBean(Person.class, new Supplier<Person>() {
            public Person get() {
                Person p = new Person();
                p.setName("hallo");
                return p;
            }
        });

        applicationContext.refresh();

        Person person = (Person) applicationContext.getBean("person");
        System.out.println(person.getName());
    }
}
