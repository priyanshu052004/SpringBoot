package com.s2p.section7.Controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiRequestLegacyController {

    @GetMapping({"","/","/v1"}) // 1.0.0 -> 1.0.1 -> 1.1.0 -> 2.0.0
    public ResponseEntity<String> defaultPathVersion()
    {
        return  ResponseEntity.ok("Response From defaultPathVersion API 1.0.0");
    }
    // http://localhost:8080/v2
    @GetMapping("/v2")
    public ResponseEntity<String> pathV2Version()
    {
        return  ResponseEntity.ok("Response From pathV2Version API 2.0.0");
    }
    // http://localhost:8080?version=1
    @GetMapping(params = "version=1")
    public ResponseEntity<String> defaultRequestParamVersion()
    {
        return ResponseEntity.ok("Response From defaultRequestParamVersion API 1.0.0");
    }
    // http://localhost:8080?version=2
    @GetMapping(params = "version=2")
    public ResponseEntity<String> RequestParamV2Version()
    {
        return  ResponseEntity.ok("Response From RequestParamV2Version API 2.0.0");
    }
    @GetMapping(headers = "X-API-VERSION=1")
    public ResponseEntity<String> defaultRequestHeaderVersion()
    {
        return ResponseEntity.ok("Response From defaultRequestHeaderVersion API 1.0.0");
    }
    @GetMapping(headers = "X-API-VERSION=2")
    public ResponseEntity<String> RequestHeaderV2Version()
    {
        return  ResponseEntity.ok("Response From RequestHeaderV2Version API 2.0.0");
    }


}
