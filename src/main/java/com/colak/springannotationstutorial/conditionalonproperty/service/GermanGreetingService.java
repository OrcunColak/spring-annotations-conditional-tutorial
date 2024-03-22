package com.colak.springannotationstutorial.conditionalonproperty.service;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Service;

@Service
@ConditionalOnProperty(name = "greeting.service.type", havingValue = "german")
public class GermanGreetingService implements GreetingService {

    @Override
    public String greet() {
        return "Hallo";
    }

}
