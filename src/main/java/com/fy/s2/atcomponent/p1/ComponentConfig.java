package com.fy.s2.atcomponent.p1;

import org.springframework.context.annotation.ComponentScan;


//@ComponentScan("com.fy.s2.atcomponent.p1")
@ComponentScan({"com.fy.s2.atcomponent.p1",
        "com.fy.s2.atcomponent.p2"}
)
public class ComponentConfig {
}
