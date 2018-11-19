package com.lin.springcloud._01.serverfeign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "client", fallback = ServiceHystric.class)
@Service
public interface ServiceHi {
    @GetMapping(value = "/hi")
    String sayHi(@RequestParam(value = "name") String name);
}
