package com.example.developerserver.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/")
    public String getHomePage(){
        return"/home";
    }
    @GetMapping("/task1")
    public String getTask1(Model model){
        model.addAttribute("text", "Bad programmers worry about the code. Good programmers worry about data structures and theirrelationships");
        return "/task1";
    }
}
