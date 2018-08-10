package com.duanss.servicefeign.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
@FeignClient(value = "hello-service", fallback = HelloClientHystric.class)
public interface HelloClient {

    @GetMapping("/hello")
    String sayHelloForHelloService(@RequestParam(value = "name") String name);


}
