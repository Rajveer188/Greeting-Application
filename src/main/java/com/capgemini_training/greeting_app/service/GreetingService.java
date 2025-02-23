package com.capgemini_training.greeting_app.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Component
public class GreetingService {
    //construction
    public GreetingService(){}
    //service for greeting
    public String greet(){
        return "Hello World";
    }
}
