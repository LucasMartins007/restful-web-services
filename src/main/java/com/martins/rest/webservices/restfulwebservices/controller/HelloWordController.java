package com.martins.rest.webservices.restfulwebservices.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWordController {

    @GetMapping(path = "/hello-word")
    public String helloWord() {
        return "Hello word";
    }

    @GetMapping(path = "/hello-word-bean")
    public HelloWordBean helloWordBean() {
        return new HelloWordBean("Hello-word");
    }

}
