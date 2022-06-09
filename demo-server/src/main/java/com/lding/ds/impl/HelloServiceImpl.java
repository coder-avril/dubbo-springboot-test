package com.lding.ds.impl;

import com.lding.da.service.IHelloService;
import org.apache.dubbo.config.annotation.Service;

// 注意这里的注解@Service是dubbo里面的
@Service
public class HelloServiceImpl implements IHelloService {
    @Override
    public String greet(String name) {
        System.out.println("name = " + name);
        return "hello: " + name;
    }
}
