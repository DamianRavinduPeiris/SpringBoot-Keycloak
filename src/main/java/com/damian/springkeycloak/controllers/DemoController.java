package com.damian.springkeycloak.controllers;

import com.damian.springkeycloak.response.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("customer")
public class DemoController {
    @Autowired
    private Response response;

    @GetMapping(path = "/getCustomer", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Response> hello() {
        response.setStatusCode(HttpStatus.OK.value());
        response.setMessage("Hello from Application 1!");
        response.setData(null);
        return ResponseEntity.ok(response);


    }
}
