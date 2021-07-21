package com.fy.s4.initializingBeanAfter;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;
import org.springframework.stereotype.Component;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

@Component
public class MyInstantiationAwareBeanPostProcessor implements InstantiationAwareBeanPostProcessor {
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if ("msg".equals(beanName)) {
            System.out.println(">>> 初始化后");
            Object o = Proxy.newProxyInstance(bean.getClass().getClassLoader(), bean.getClass().getInterfaces(),
                    new InvocationHandler() {
                        @Override
                        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                            System.out.println("代理逻辑1");
                            method.invoke(bean, args);
                            System.out.println("代理逻辑2");
                            return null;
                        }
                    });
            // todo 返回proxy对象代替ioc中的msg对象
            return o;
        }
        return null;
    }
}
