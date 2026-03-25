package com.s2p.section7.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {


    @GetMapping(path = {"/","/hello"})
    public String hello(){
        return "Hello priyanshu!";
    }
}
