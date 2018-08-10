package com.duanss.servicefeign.web.rest;

import com.duanss.servicefeign.client.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: spring-cloud-demo
 * @description: feign，访问hello-service
 * @author: duanss
 * @create: 2018-08-10 15:57
 **/
@RestController
public class HelloController {

    @Autowired
    HelloService helloService;


    @GetMapping("/hello")
    public String hello(@RequestParam String name){
        return helloService.sayHello(name);
    }

}
