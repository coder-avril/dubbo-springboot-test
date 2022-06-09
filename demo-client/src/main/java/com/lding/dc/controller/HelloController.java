package com.lding.dc.controller;

import com.lding.da.service.IHelloService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    //注意这里的注解@Reference同样来自dubbo
    @Reference
    private IHelloService helloService;

    @RequestMapping("say")
    public String say(String name){
        return helloService.greet(name);
    }
}
