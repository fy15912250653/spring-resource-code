package com.fy.s3.annotationApplicationContext;

import org.springframework.context.annotation.Bean;

public class Config {

    @Bean
    public Obj obj(){
        return new Obj();
    }
}
