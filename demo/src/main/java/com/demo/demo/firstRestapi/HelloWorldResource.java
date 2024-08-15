package com.demo.demo.firstRestapi;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HelloWorldResource {
    @GetMapping("/hello-world")
    public String helloWorld1(){
        return "Hello World";
    }
}
