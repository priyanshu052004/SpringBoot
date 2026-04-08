package com.s2p.section7.Controller;

import org.apache.catalina.User;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequestMappingController
{
    // http://localhost:8080/api/v1/requestMapping/hello
    @RequestMapping(
            path = "/api/v1/requestMapping/hello"
    )
    public String hello()
    {
        return "Hello From Spring Boot Server";
    }
    @RequestMapping(
            path = {"/api/v1/requestMapping/usersName"},
            method = {RequestMethod.GET,RequestMethod.POST}
    )
    public String userName()
    {
        return "User name is Sachin Tendulkar";
    }
    @RequestMapping(
            path = {"/api/v1/requestMapping/usersName/json"},
            method = {RequestMethod.GET},
            produces = {"application/json"}
    )
    public String userDetailsJSON()
    {
        return "{\"name\" : \"Pranay\"}";
    }


}
