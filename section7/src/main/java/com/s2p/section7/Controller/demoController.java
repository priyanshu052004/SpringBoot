package com.s2p.section7.Controller;


import com.s2p.section7.dto.DtoUser;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class demoController {
    @RequestMapping(path = {"/demo"}, method = {RequestMethod.GET, RequestMethod.POST})
    public String demo(){
        return "Hello priyanshu!";
    }


    @RequestMapping(
        path = {"/user"},
            method = {RequestMethod.POST},
            consumes =MediaType.APPLICATION_JSON_VALUE
    )

    public String getUser(@RequestBody DtoUser userdtoo){
        return "User Recived the name: " + userdtoo.getName() ;
    }
}
