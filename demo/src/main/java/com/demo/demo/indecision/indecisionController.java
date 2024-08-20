package com.demo.demo.indecision;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class indecisionController {
    private indecisionRepo indecisionRepo;
    
    public indecisionController(com.demo.demo.indecision.indecisionRepo indecisionRepo) {
        this.indecisionRepo = indecisionRepo;
    }

    @GetMapping(value="/welcome")
    public String requestMethodName(Model model) {
        try{
            List<indecision> indecisions = new ArrayList<indecision>(); 
            indecisionRepo.findAll().forEach(indecisions::add);
            model.addAttribute("indecisions",indecisions);
          
        }catch(Exception e){
            model.addAttribute("message", e.getMessage());
        }
        return "indecision/welcome";
        
    }
    
}
