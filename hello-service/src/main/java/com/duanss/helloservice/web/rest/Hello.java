package com.duanss.helloservice.web.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: spring-cloud-demo
 * @description: hello
 * @author: duanss
 * @create: 2018-08-10 14:33
 **/
@RestController
public class Hello {

    @Value("${server.port}")
    String port;

    @GetMapping("/hello")
    public String hello(@RequestParam String name){
        return "hello I am "+ name +"hello-service ,my port is " + port;
    }


}
