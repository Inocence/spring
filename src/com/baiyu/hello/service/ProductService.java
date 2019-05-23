package com.baiyu.hello.service;

import org.springframework.stereotype.Component;

@Component("s")
public class ProductService {

    public void doSomeService() {
        System.out.println("doSomeService");
    }
}
