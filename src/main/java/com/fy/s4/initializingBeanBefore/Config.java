package com.fy.s4.initializingBeanBefore;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.fy.s4.initializingBeanBefore")
public class Config {
    @Bean
    public String text(){
        return "hallo";
    }
}
