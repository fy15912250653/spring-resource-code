package com.fy.s2.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class Config {

    @Bean()
    public AtBean atBean() {
        return new AtBean();
    }
}
