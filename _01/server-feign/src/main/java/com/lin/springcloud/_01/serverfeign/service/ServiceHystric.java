package com.lin.springcloud._01.serverfeign.service;

import org.springframework.stereotype.Component;

@Component
public class ServiceHystric implements ServiceHi {
    @Override
    public String sayHi(String name) {
        return "sorry ," + name;
    }
}
