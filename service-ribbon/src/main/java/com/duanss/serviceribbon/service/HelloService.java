package com.duanss.serviceribbon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

/**
 * @program: spring-cloud-demo
 * @description: hello
 * @author: duanss
 * @create: 2018-08-10 15:32
 **/
@Service
public class HelloService {

    @Autowired
    RestTemplate restTemplate;

    public String hello(String name){
        return restTemplate.getForObject("http://HELLO-SERVICE/hello?name="+name,String.class);
    }


}
