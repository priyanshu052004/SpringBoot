package com.s2p.section7.Controller;


import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {


    @GetMapping(path = {"/api/v1/get"})
    public String getApiMethod(){
        return "Get Api Method" ;
    }
    @PutMapping(path = {"/api/v1/put"})
    public String putApiMethod(){
        return "put Api Method" ;
    }
    @DeleteMapping (path = {"/api/v1/delete"})
    public String deleteApiMethod(){
        return "delete Api Method" ;
    }
    @PostMapping(path = {"/api/v1/post"})
    public String postApiMethod(){
        return "post Api Method" ;
    }
    @PatchMapping(path = {"/api/v1/patch"})
    public String patchApiMethod(){
        return "patch Api Method" ;
    }
}
