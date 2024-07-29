package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainContriller {
    @GetMapping("/demo")
    @ResponseBody
    public String index(){
        return "Hello World";   
    }
}
