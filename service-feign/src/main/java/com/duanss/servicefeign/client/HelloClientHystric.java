package com.duanss.servicefeign.client;

import org.springframework.stereotype.Component;

/**
 * @program: spring-cloud-demo
 * @description:
 * @author: duanss
 * @create: 2018-08-10 16:23
 **/
@Component
public class HelloClientHystric implements HelloClient{


    @Override
    public String sayHelloForHelloService(String name) {
        return "oh my god , is wrong " + name ;
    }
}
