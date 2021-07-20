package com.fy.s4.constructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.fy.s4.constructor")
public class Config {
    @Bean
    public Apple apple3(){
        return new Apple();
    }
    @Bean
    public Object obj(){
        return new Object();
    }
}
