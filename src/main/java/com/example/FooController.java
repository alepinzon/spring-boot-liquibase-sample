package com.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FooController {

    @GetMapping(path = "/foo")
    public String sayHello() {
        throw new RuntimeException("Hello World Exception");
        //return "Hello World";
    }

}
