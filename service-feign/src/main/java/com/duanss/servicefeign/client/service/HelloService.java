package com.duanss.servicefeign.client.service;

import com.duanss.servicefeign.client.HelloClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program: spring-cloud-demo
 * @description: service
 * @author: duanss
 * @create: 2018-08-10 15:54
 **/
@Service
public class HelloService {

    @Autowired
    HelloClient helloClient;


    public String sayHello(String name){
        return helloClient.sayHelloForHelloService(name);
    }


}
