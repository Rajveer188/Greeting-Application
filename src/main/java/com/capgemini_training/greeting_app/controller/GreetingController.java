package com.capgemini_training.greeting_app.controller;

import com.capgemini_training.greeting_app.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/greet")
@Component
public class GreetingController {

    private GreetingService greetingService;

    //inject dependency
    @Autowired
    public GreetingController(GreetingService greetingService){
        this.greetingService = greetingService;
    }

    //http get method
    @GetMapping("/get")
    public String getGreeting(){
        return greetingService.greet();
    }
    //http put method
    @PutMapping("/put")
    public String putGreeting(){
        return greetingService.greet();
    }
    //http delete method
    @DeleteMapping("/delete")
    public String deleteGreeting(){
        return greetingService.greet();
    }
    //http post method
    @PostMapping("/post")
    public String postGreeting(){
        return greetingService.greet();
    }
}
