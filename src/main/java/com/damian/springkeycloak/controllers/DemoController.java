package com.damian.springkeycloak.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("customer")
public class DemoController {
    @GetMapping(path = "/hello")
    public String hello(){
        return "Hello From Spring Boot and Keycloak!";
    }
}
