package com.capgemini_training.greeting_app.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/greet")
public class GreetingController {
    //http get method
    @GetMapping("/get")
    public String getGreetin(){
        return "{\"message\" : \"welcome from get method\"}";
    }
    //http put method
    @PutMapping("/put")
    public String putGreeting(){
        return "{\"message\" : \"welcome from put method\"}";
    }
    //http delete method
    @DeleteMapping("/delete")
    public String deleteGreeting(){
        return "{\"message\" : \"welcome from delete method\"}";
    }
    //http post method
    @PostMapping("/post")
    public String postGreet(){
        return "{\"message\" : \"welcome from post method\"}";
    }
}
