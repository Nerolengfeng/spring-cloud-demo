package com.duanss.configclient.web.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: spring-cloud-demo
 * @description: df
 * @author: duanss
 * @create: 2018-08-10 17:51
 **/
@RestController
public class GetFile {

    @Value("${democonfigclient.message}")
    String foo;

    @GetMapping("hello")
    public String hi(){
        return foo;
    }

}
