package com.demo.demo.indecision;

import org.springframework.web.bind.annotation.RestController;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class loginController {
    @RequestMapping("/login")
    public String gotoLoginPage() {
        return "indecision/login";
    }
    @RequestMapping(value="/welcome")
    @PostMapping
    public String gotoWelcomePage(@RequestParam String name,Model model) {
        model.addAttribute("name",name);
        return "indecision/welcome";
    }

    
}
