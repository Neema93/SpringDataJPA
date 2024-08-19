package com.demo.demo.indecision;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class loginController {
    @GetMapping("/login")
    public String getMethodName() {
        return "indecision/login";
    }
    
}
