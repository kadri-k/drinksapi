package com.northcoders.drinksapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping(value = "/")
    public String home() {
        return "Welcome to the Drinks API!";
    }

    @GetMapping(value = "/coffeelover")
    public String getCoffee(){
        return "I like coffee!";
    }
}