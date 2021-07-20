package com.fy.s4.initializingBean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.fy.s4.initializingBean")
public class Config {
    @Bean
    public String text(){
        return "hallo";
    }
}
