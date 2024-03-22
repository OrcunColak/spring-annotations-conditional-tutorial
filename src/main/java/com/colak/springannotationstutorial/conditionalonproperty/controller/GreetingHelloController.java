package com.colak.springannotationstutorial.conditionalonproperty.controller;

import com.colak.springannotationstutorial.conditionalonproperty.service.GreetingService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class GreetingHelloController {

    private final GreetingService greetingService;

    // http://localhost:8080/greet
    @GetMapping("/greet")
    public String hello() {
        return greetingService.greet();
    }

}
