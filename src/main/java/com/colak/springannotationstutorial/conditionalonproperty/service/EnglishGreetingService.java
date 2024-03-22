package com.colak.springannotationstutorial.conditionalonproperty.service;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Service;

@Service
@ConditionalOnProperty(name = "greeting.service.type", havingValue = "english")
public class EnglishGreetingService implements GreetingService {

    @Override
    public String greet() {
        return "Hello";
    }

}
