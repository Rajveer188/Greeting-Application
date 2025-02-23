package com.capgemini_training.greeting_app.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Component
public class GreetingService {
    //construction
    public GreetingService(){}
    //service for greeting
    public String greet(String firstName, String lastName) {
        if (firstName != null && lastName != null) {
            return "Hello, " + firstName + " " + lastName;
        } else if (firstName != null) {
            return "Hello, " + firstName;
        } else if (lastName != null) {
            return "Hello, " + lastName;
        } else {
            return "Hello World";
        }
    }
}
