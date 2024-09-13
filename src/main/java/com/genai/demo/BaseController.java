package com.genai.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/intro")
public class BaseController {

    @GetMapping("/message")
    public String message(){
        return "¡Test message!";
    }
}
