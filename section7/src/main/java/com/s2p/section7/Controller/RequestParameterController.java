package com.s2p.section7.Controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/requestparam/")
public class RequestParameterController {


    @RequestMapping(
            path = "user/search"
    )
    public String searchUserByNameGender(@RequestParam() String name,@RequestParam(name = "gender") String sex){

        return "user name is: " + name + " user gender is : " + sex ;

    }

    @RequestMapping(
            path = "user/search-optional"
    )

    public String searchNameByOptionalNameAndGender(String name, String ){

        return "";
    }


}
