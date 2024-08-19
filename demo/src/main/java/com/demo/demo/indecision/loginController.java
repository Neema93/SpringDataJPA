package com.demo.demo.indecision;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class loginController {
    @RequestMapping("/login")
    public String getMethodName() {
        return "indecision/login";
    }
    
}
